/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.drools.epn.util;

import java.util.Map;

import org.drools.epn.EPNPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EPNXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPNXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        EPNPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the EPNResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new EPNResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new EPNResourceFactoryImpl());
        }
        return registrations;
    }

} //EPNXMLProcessor
