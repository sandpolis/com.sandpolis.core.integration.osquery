//============================================================================//
//                                                                            //
//            Copyright © 2015 - 2022 Sandpolis Software Foundation           //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPLv2. //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("org.s7s.build.module")
	id("org.s7s.build.publish")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.+")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")

	// https://github.com/FasterXML/jackson-databind
	implementation("com.fasterxml.jackson.core:jackson-databind:2.12.4")

	if (project.getParent() == null) {
		implementation("org.s7s:core.foundation:+")
		implementation("org.s7s:core.instance:+")
		implementation("org.s7s:core.integration.pacman:+")
	} else {
		implementation(project(":core:org.s7s.core.foundation"))
		implementation(project(":core:org.s7s.core.instance"))
		implementation(project(":core:integration:org.s7s.core.integration.pacman"))
	}
}
