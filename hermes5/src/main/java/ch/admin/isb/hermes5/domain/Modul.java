/*----------------------------------------------------------------------------------------------
 * Copyright 2014 Federal IT Steering Unit FITSU Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *---------------------------------------------------------------------------------------------*/
package ch.admin.isb.hermes5.domain;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.admin.isb.hermes5.epf.uma.schema.DescribableElement;
import ch.admin.isb.hermes5.epf.uma.schema.Discipline;
import ch.admin.isb.hermes5.epf.uma.schema.MethodElement;
import ch.admin.isb.hermes5.util.StringUtil;


public class Modul extends AbstractMethodenElement {
 
    private Discipline discipline;

    private List<Aufgabe> aufgaben;

    public Modul(Discipline discipline, Map<String, MethodElement> index) {
        super(index);
        aufgaben = new ArrayList<Aufgabe>();
        this.discipline = discipline;
    }
    public boolean isCustom() {
        return false;
    }

        
    public List<Aufgabe> getAufgaben() {
        return aufgaben;
    }
    
    public Discipline getDiscipline() {
        return discipline;
    }
     
    public String getName() {
        return "modul_" + StringUtil.replaceSpecialChars(discipline.getName());
    }

    public DescribableElement getElement() {
        return discipline;
    }

    public List<Ergebnis> getErgebnisse() {
        Set<Ergebnis> set = new LinkedHashSet<Ergebnis>();
        for (Aufgabe aufgabe : getAufgaben()) {
            set.addAll(aufgabe.getErgebnisse());
        }
        return new ArrayList<Ergebnis>(set );
    }

    public void addAufgabe(Aufgabe aufgabe) {
        if(! aufgaben.contains(aufgabe)) {
            aufgaben.add(aufgabe);
        }
        
    }
}
