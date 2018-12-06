/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc

import org.lwjgl.generator.*

fun config(){
    packageInfo(
        Module.HWLOC,
        """
        Contains bindings to the ${url("https://www.open-mpi.org/projects/hwloc/", "hwloc")} library.

        The Hardware Locality (hwloc) software project aims at easing the process of
        discovering hardware resources in parallel architectures. It offers
        command-line tools and a C API for consulting these resources, their locality,
        attributes, and interconnection. hwloc primarily aims at helping
        high-performance computing (HPC) applications, but is also applicable to any
        project seeking to exploit code and/or data locality on modern computing
        platforms.
        """
    )
}