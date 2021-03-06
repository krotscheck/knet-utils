/*
 * Copyright (c) 2014 Michael Krotscheck
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.krotscheck.test;

import net.krotscheck.test.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for the integration test annotation interface.
 *
 * @author Michael Krotscheck
 */
@Category(UnitTest.class)
public final class UnitTestTest {

    /**
     * Test that the annotation exists.
     */
    @Test
    public void testAnnotationExists() {
        Assert.assertTrue(UnitTest.class.isInterface());
    }
}
