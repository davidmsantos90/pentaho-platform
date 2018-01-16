/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License, version 2 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2006 - 2017 Hitachi Vantara.  All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * Java class for ExportManifestEntityDto complex type.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="ExportManifestEntityDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportManifestProperty" type="{http://www.pentaho.com/schema/}ExportManifestProperty"
 * maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="path">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ExportManifestEntityDto", propOrder = { "exportManifestProperty" } )
public class ExportManifestEntityDto {

  @XmlElement( name = "ExportManifestProperty", required = true )
  protected List<ExportManifestProperty> exportManifestProperty;
  @XmlAttribute( name = "path" )
  protected String path;

  /**
   * Gets the value of the exportManifestProperty property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the exportManifestProperty property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <p/>
   * 
   * <pre>
   * getExportManifestProperty().add( newItem );
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list {@link ExportManifestProperty }
   */
  public List<ExportManifestProperty> getExportManifestProperty() {
    if ( exportManifestProperty == null ) {
      exportManifestProperty = new ArrayList<ExportManifestProperty>();
    }
    return this.exportManifestProperty;
  }

  /**
   * Gets the value of the path property.
   * 
   * @return possible object is {@link String }
   */
  public String getPath() {
    return path;
  }

  /**
   * Sets the value of the path property.
   * 
   * @param value
   *          allowed object is {@link String }
   */
  public void setPath( String value ) {
    this.path = value;
  }

}