// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.checkinpolicies.build;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import java.rmi.activation.Activator;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * The activator class controls the plug-in life cycle
 */
public class TFSBuildCheckinPolicyPlugin extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.microsoft.tfs.checkinpolicies.build"; //$NON-NLS-1$

    // The shared instance
    private static TFSBuildCheckinPolicyPlugin plugin;

    private static final Log log = LogFactory.getLog(TFSBuildCheckinPolicyPlugin.class);

    /**
     * The constructor
     */
    public TFSBuildCheckinPolicyPlugin() {
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

        log.debug("PLUGN BuildCheckin started");
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static TFSBuildCheckinPolicyPlugin getDefault() {
        return plugin;
    }

}
