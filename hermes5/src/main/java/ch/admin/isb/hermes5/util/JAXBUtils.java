/*----------------------------------------------------------------------------------------------
 * Copyright 2014 Federal IT Steering Unit FITSU Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *---------------------------------------------------------------------------------------------*/
package ch.admin.isb.hermes5.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

public class JAXBUtils {

    public static <T> List<T> getValuesWithName(List<JAXBElement<T>> list, String name) {
        List<T> result = new ArrayList<T>();

        for (JAXBElement<T> jaxbElement : list) {
            if (name.equals(jaxbElement.getName().getLocalPart())) {
                result.add(jaxbElement.getValue());
            }
        }

        return result;
    }
}
