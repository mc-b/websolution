/*----------------------------------------------------------------------------------------------
 * Copyright 2014 Federal IT Steering Unit FITSU Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *---------------------------------------------------------------------------------------------*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.26 at 01:23:26 PM CET 
//


package ch.admin.isb.hermes5.model.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hermes.admin.ch/model/hermes5/v1}roles" minOccurs="0"/>
 *         &lt;element ref="{http://www.hermes.admin.ch/model/hermes5/v1}modules" minOccurs="0"/>
 *         &lt;element ref="{http://www.hermes.admin.ch/model/hermes5/v1}tasks" minOccurs="0"/>
 *         &lt;element ref="{http://www.hermes.admin.ch/model/hermes5/v1}workproducts" minOccurs="0"/>
 *         &lt;element ref="{http://www.hermes.admin.ch/model/hermes5/v1}scenario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelType", propOrder = {
    "roles",
    "modules",
    "tasks",
    "workproducts",
    "scenario"
})
public class ModelType {

    @XmlElement(namespace = "http://www.hermes.admin.ch/model/hermes5/v1")
    protected Roles roles;
    @XmlElement(namespace = "http://www.hermes.admin.ch/model/hermes5/v1")
    protected Modules modules;
    @XmlElement(namespace = "http://www.hermes.admin.ch/model/hermes5/v1")
    protected Tasks tasks;
    @XmlElement(namespace = "http://www.hermes.admin.ch/model/hermes5/v1")
    protected Workproducts workproducts;
    @XmlElement(namespace = "http://www.hermes.admin.ch/model/hermes5/v1", required = true)
    protected Scenario scenario;

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link Roles }
     *     
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roles }
     *     
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Modules }
     *     
     */
    public Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modules }
     *     
     */
    public void setModules(Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link Tasks }
     *     
     */
    public Tasks getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *     
     */
    public void setTasks(Tasks value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the workproducts property.
     * 
     * @return
     *     possible object is
     *     {@link Workproducts }
     *     
     */
    public Workproducts getWorkproducts() {
        return workproducts;
    }

    /**
     * Sets the value of the workproducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workproducts }
     *     
     */
    public void setWorkproducts(Workproducts value) {
        this.workproducts = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link Scenario }
     *     
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scenario }
     *     
     */
    public void setScenario(Scenario value) {
        this.scenario = value;
    }

}
