/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.test._.testcases;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import java.sql.Date;

import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Result;
import org.jooq.TableRecord;
import org.jooq.UpdatableRecord;
import org.jooq.test.BaseTest;
import org.jooq.test.jOOQAbstractTest;

import org.junit.Test;

public class ReferentialTests<
    A    extends UpdatableRecord<A> & Record6<Integer, String, String, Date, Integer, ?>,
    AP,
    B    extends UpdatableRecord<B>,
    S    extends UpdatableRecord<S> & Record1<String>,
    B2S  extends UpdatableRecord<B2S> & Record3<String, Integer, Integer>,
    BS   extends UpdatableRecord<BS>,
    L    extends TableRecord<L> & Record2<String, String>,
    X    extends TableRecord<X>,
    DATE extends UpdatableRecord<DATE>,
    BOOL extends UpdatableRecord<BOOL>,
    D    extends UpdatableRecord<D>,
    T    extends UpdatableRecord<T>,
    U    extends TableRecord<U>,
    UU   extends UpdatableRecord<UU>,
    I    extends TableRecord<I>,
    IPK  extends UpdatableRecord<IPK>,
    T725 extends UpdatableRecord<T725>,
    T639 extends UpdatableRecord<T639>,
    T785 extends TableRecord<T785>>
extends BaseTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> {

    public ReferentialTests(jOOQAbstractTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> delegate) {
        super(delegate);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFetchParentAndChildren() throws Exception {
        Result<A> authors = create().selectFrom(TAuthor()).orderBy(TAuthor_ID()).fetch();
        Result<B> books = create().selectFrom(TBook()).orderBy(TBook_ID()).fetch();

        A a1 = authors.get(0);
        A a2 = authors.get(1);
        B b1 = books.get(0);
        B b2 = books.get(1);
        B b3 = books.get(2);
        B b4 = books.get(3);

        // Fetching parents
        assertEquals(a1, b1.fetchParent(FK_T_BOOK_AUTHOR_ID()));
        assertEquals(a1, FK_T_BOOK_AUTHOR_ID().fetchParent(b1));
        assertSame(asList(a1), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b2));
        assertSame(asList(a1, a2), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b3));
        assertSame(asList(a1, a2), FK_T_BOOK_AUTHOR_ID().fetchParents(b1, b2, b3, b4));

        // Fetching children
        assertSame(asList(b1, b2), a1.fetchChildren(FK_T_BOOK_AUTHOR_ID()));
        assertSame(asList(b1, b2), FK_T_BOOK_AUTHOR_ID().fetchChildren(a1));
        assertSame(asList(b3, b4), a2.fetchChildren(FK_T_BOOK_AUTHOR_ID()));
        assertSame(asList(b3, b4), FK_T_BOOK_AUTHOR_ID().fetchChildren(a2));
        assertSame(asList(b1, b2, b3, b4), FK_T_BOOK_AUTHOR_ID().fetchChildren(a1, a2));

        // No co-authors available
        assertNull(b1.fetchParent(FK_T_BOOK_CO_AUTHOR_ID()));
        assertNull(a1.fetchChild(FK_T_BOOK_CO_AUTHOR_ID()));
    }
}
