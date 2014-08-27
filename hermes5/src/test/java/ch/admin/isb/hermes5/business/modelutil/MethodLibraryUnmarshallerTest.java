/*----------------------------------------------------------------------------------------------
 * Copyright 2014 Federal IT Steering Unit FITSU Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *---------------------------------------------------------------------------------------------*/
package ch.admin.isb.hermes5.business.modelutil;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.admin.isb.hermes5.epf.uma.schema.MethodLibrary;

public class MethodLibraryUnmarshallerTest {

    private MethodLibraryUnmarshaller methodLibraryUnmarshaller = new MethodLibraryUnmarshaller();

    @Test
    public void testUnmarshalMethodLibrary() {
        MethodLibrary methodLibrary = methodLibraryUnmarshaller.unmarshalMethodLibrary(getClass().getResourceAsStream(
                "export.xml"));
        assertNotNull(methodLibrary);
        assertEquals("_5qZTgLk5EeGS_sZhKwrDPg", methodLibrary.getMethodPlugin().get(0).getId());

    }

}
