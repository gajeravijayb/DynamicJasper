/*
 * Dynamic Jasper: A library for creating reports dynamically by specifying
 * columns, groups, styles, etc. at runtime. It also saves a lot of development
 * time in many cases! (http://sourceforge.net/projects/dynamicjasper)
 *
 * Copyright (C) 2008  FDV Solutions (http://www.fdvsolutions.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 *
 * License as published by the Free Software Foundation; either
 *
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *
 */

package ar.com.fdvs.dj.domain.constants;

public class Position {

	private byte value;


	public static Position POSITION_TYPE_FIX_RELATIVE_TO_TOP = new Position((byte) 2);
	public static Position POSITION_TYPE_FIX_RELATIVE_TO_BOTTOM = new Position((byte) 3);
	public static Position POSITION_TYPE_FLOAT = new Position((byte) 1);

	private Position(byte value){
		this.value = value;
	}

	public byte getValue() {
		return value;
	}
}