/*
 * $Id: ConverterBean.java,v 1.2 2004/01/27 20:13:35 eburns Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.config.beans;


import java.util.Map;
import java.util.TreeMap;


/**
 * <p>Configuration bean for <code>&lt;attribute&gt; element.</p>
 */

public class ConverterBean extends FeatureBean
 implements AttributeHolder, PropertyHolder {


    // -------------------------------------------------------------- Properties


    private String converterClass;
    public String getConverterClass() { return converterClass; }
    public void setConverterClass(String converterClass)
    { this.converterClass = converterClass; }


    private String converterForClass;
    public String getConverterForClass() { return converterForClass; }
    public void setConverterForClass(String converterForClass)
    { this.converterForClass = converterForClass; }


    private String converterId;
    public String getConverterId() { return converterId; }
    public void setConverterId(String converterId)
    { this.converterId = converterId; }


    // -------------------------------------------------------------- Extensions


    // ------------------------------------------------- AttributeHolder Methods


    private Map attributes = new TreeMap();


    public void addAttribute(AttributeBean descriptor) {
        attributes.put(descriptor.getAttributeName(), descriptor);
    }


    public AttributeBean getAttribute(String name) {
        return ((AttributeBean) attributes.get(name));
    }


    public AttributeBean[] getAttributes() {
        AttributeBean results[] = new AttributeBean[attributes.size()];
        return ((AttributeBean[]) attributes.values().toArray(results));
    }


    public void removeAttribute(AttributeBean descriptor) {
        attributes.remove(descriptor.getAttributeName());
    }


    // ------------------------------------------------- PropertyHolder Methods


    private Map properties = new TreeMap();


    public void addProperty(PropertyBean descriptor) {
        properties.put(descriptor.getPropertyName(), descriptor);
    }


    public PropertyBean getProperty(String name) {
        return ((PropertyBean) properties.get(name));
    }


    public PropertyBean[] getProperties() {
        PropertyBean results[] = new PropertyBean[properties.size()];
        return ((PropertyBean[]) properties.values().toArray(results));
    }


    public void removeProperty(PropertyBean descriptor) {
        properties.remove(descriptor.getPropertyName());
    }


    // ----------------------------------------------------------------- Methods


}
