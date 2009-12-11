/**
 * Copyright (c) 2000-2009, Jasig, Inc.
 * See license distributed with this file and available online at
 * https://www.ja-sig.org/svn/jasig-parent/tags/rel-10/license-header.txt
 */
package org.jasig.portal.portlets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringListAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> value = new ArrayList<String>();
    
    public StringListAttribute() {
    }
    
    public StringListAttribute(List<String> value) {
        this.value = value;
    }

    public StringListAttribute(String[] value) {
    	List<String> values = new ArrayList<String>();
        values.addAll(Arrays.<String>asList(value));
        this.value = values;
    }

    /**
     * @return the value
     */
    public List<String> getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(List<String> value) {
        this.value = value;
    }

    public void setValue(String[] value) {
    	List<String> values = new ArrayList<String>();
        values.addAll(Arrays.<String>asList(value));
        this.value = values;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object anObject) {
        return this.value == anObject || (this.value != null && this.value.equals(anObject));
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.value != null ? this.value.hashCode() : 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}