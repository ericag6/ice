/*******************************************************************************
 * Copyright (c) 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - Jay Jay Billings,
 *   Jordan H. Deyton, Dasha Gorin, Alexander J. McCaskey, Taylor Patterson,
 *   Claire Saunders, Matthew Wang, Anna Wojtowicz
 *******************************************************************************/
package org.eclipse.ice.proteus;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemBuilder;
import org.eclipse.ice.item.ItemType;

/** 
 * <p>An ItemBuilder for building PROTEUS job launchers.</p>
 * @author Jay Jay Billings
 */
public class PROTEUSLauncherBuilder implements ItemBuilder {
	
	/**
	 * The name
	 */
	public static final String name = "PROTEUS Launcher";
	
	/**
	 * The Item type
	 */
	public static final ItemType type = ItemType.Simulation;
	
	/** 
	 * (non-Javadoc)
	 * @see ItemBuilder#getItemName()
	 */
	public String getItemName() {
		return name;
	}

	/** 
	 * (non-Javadoc)
	 * @see ItemBuilder#getItemType()
	 */
	public ItemType getItemType() {
		return type;
	}

	/** 
	 * (non-Javadoc)
	 * @see ItemBuilder#build(IProject projectSpace)
	 */
	public Item build(IProject projectSpace) {
		
		PROTEUSLauncher launcher = new PROTEUSLauncher(projectSpace);
		launcher.setName(name);
		launcher.setItemBuilderName(name);
		
		return launcher;
	}
}