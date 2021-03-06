/*******************************************************************************
 * Copyright (c) 2012, 2014 UT-Battelle, LLC.
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
package org.eclipse.ice.item.geometry;

import static org.eclipse.ice.item.geometry.GeometryEditor.*;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemBuilder;
import org.eclipse.ice.item.ItemType;

/**
 * <p>
 * This class realizes the ItemBuilder interface to provide instances of the
 * GeometryEditor to ICE. Calling GeometryEditorBuilder.build() will return an
 * instance of the GeometryEditor that is fully-initialized and ready for use.
 * </p>
 * 
 * @author Jay Jay Billings
 */
public class GeometryEditorBuilder implements ItemBuilder {
	/**
	 * <p>
	 * The name of the Geometry Editor.
	 * </p>
	 * 
	 */
	public static final String name = "Geometry Editor";
	/**
	 * <p>
	 * The Item type of the Geometry Editor.
	 * </p>
	 * 
	 */
	public static final ItemType type = ItemType.Geometry;

	/**
	 * (non-Javadoc)
	 * 
	 * @see ItemBuilder#getItemName()
	 */
	public String getItemName() {
		return name;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see ItemBuilder#getItemType()
	 */
	public ItemType getItemType() {
		return type;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see ItemBuilder#build(IProject projectSpace)
	 */
	public Item build(IProject projectSpace) {

		// Local Declarations
		Item item = null;

		item = new GeometryEditor(projectSpace);
		// Set the item builder name
		item.setItemBuilderName(this.getItemName());

		return item;
	}
}