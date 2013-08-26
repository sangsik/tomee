/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.jee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 *        <p> <span class="changed_modified_2_2">The</span>
 *        "navigation-case" element describes a particular
 *         combination of conditions that must match for this case to
 *         be executed, and the view id of the component tree that
 *         should be selected next.</p>
 *         
 *       
 * 
 * <p>Java class for faces-config-navigation-caseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faces-config-navigation-caseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}descriptionGroup"/>
 *         &lt;element name="from-action" type="{http://xmlns.jcp.org/xml/ns/javaee}faces-config-from-actionType" minOccurs="0"/>
 *         &lt;element name="from-outcome" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="if" type="{http://xmlns.jcp.org/xml/ns/javaee}faces-config-ifType" minOccurs="0"/>
 *         &lt;element name="to-view-id" type="{http://xmlns.jcp.org/xml/ns/javaee}faces-config-valueType"/>
 *         &lt;element name="to-flow-document-id" type="{http://xmlns.jcp.org/xml/ns/javaee}java-identifierType" minOccurs="0"/>
 *         &lt;element name="redirect" type="{http://xmlns.jcp.org/xml/ns/javaee}faces-config-redirectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faces-config-navigation-caseType", propOrder = {
    "description",
    "displayName",
    "icon",
    "fromAction",
    "fromOutcome",
    "_if",
    "toViewId",
    "toFlowDocumentId",
    "redirect"
})
public class FacesConfigNavigationCase {

    protected List<Description> description;
    @XmlElement(name = "display-name")
    protected List<DisplayName> displayName;
    protected List<Icon> icon;
    @XmlElement(name = "from-action")
    protected FacesConfigFromAction fromAction;
    @XmlElement(name = "from-outcome")
    protected XmlString fromOutcome;
    @XmlElement(name = "if")
    protected FacesConfigIf _if;
    @XmlElement(name = "to-view-id", required = true)
    protected java.lang.String toViewId;
    @XmlElement(name = "to-flow-document-id")
    protected JavaIdentifier toFlowDocumentId;
    protected FacesConfigRedirect redirect;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Description>();
        }
        return this.description;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayName }
     * 
     * 
     */
    public List<DisplayName> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayName>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Icon }
     * 
     * 
     */
    public List<Icon> getIcon() {
        if (icon == null) {
            icon = new ArrayList<Icon>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the fromAction property.
     * 
     * @return
     *     possible object is
     *     {@link FacesConfigFromAction }
     *     
     */
    public FacesConfigFromAction getFromAction() {
        return fromAction;
    }

    /**
     * Sets the value of the fromAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacesConfigFromAction }
     *     
     */
    public void setFromAction(FacesConfigFromAction value) {
        this.fromAction = value;
    }

    /**
     * Gets the value of the fromOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link XmlString }
     *     
     */
    public XmlString getFromOutcome() {
        return fromOutcome;
    }

    /**
     * Sets the value of the fromOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlString }
     *     
     */
    public void setFromOutcome(XmlString value) {
        this.fromOutcome = value;
    }

    /**
     * Gets the value of the if property.
     * 
     * @return
     *     possible object is
     *     {@link FacesConfigIf }
     *     
     */
    public FacesConfigIf getIf() {
        return _if;
    }

    /**
     * Sets the value of the if property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacesConfigIf }
     *     
     */
    public void setIf(FacesConfigIf value) {
        this._if = value;
    }

    /**
     * Gets the value of the toViewId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getToViewId() {
        return toViewId;
    }

    /**
     * Sets the value of the toViewId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setToViewId(java.lang.String value) {
        this.toViewId = value;
    }

    /**
     * Gets the value of the toFlowDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JavaIdentifier }
     *     
     */
    public JavaIdentifier getToFlowDocumentId() {
        return toFlowDocumentId;
    }

    /**
     * Sets the value of the toFlowDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaIdentifier }
     *     
     */
    public void setToFlowDocumentId(JavaIdentifier value) {
        this.toFlowDocumentId = value;
    }

    /**
     * Gets the value of the redirect property.
     * 
     * @return
     *     possible object is
     *     {@link FacesConfigRedirect }
     *     
     */
    public FacesConfigRedirect getRedirect() {
        return redirect;
    }

    /**
     * Sets the value of the redirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacesConfigRedirect }
     *     
     */
    public void setRedirect(FacesConfigRedirect value) {
        this.redirect = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}