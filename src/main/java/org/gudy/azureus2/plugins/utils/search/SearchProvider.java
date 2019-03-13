/*
 * Created on Jun 20, 2008
 * Created by Paul Gardner
 * 
 * Copyright (C) Azureus Software, Inc, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */


package org.gudy.azureus2.plugins.utils.search;

import java.util.Map;

public interface 
SearchProvider 
{
		// properties
	
	int PR_ID							= 0;	// getProperty only; Long
	int PR_NAME							= 1;	// mandatory; String
	int PR_ICON_URL						= 2;	// optional; String
	int PR_DOWNLOAD_LINK_LOCATOR		= 3;	// optional; String
	int PR_REFERER						= 4;	// optional; String
	int PR_SUPPORTS_RESULT_FIELDS		= 5;	// optional; int[]
	int PR_USE_ACCURACY_FOR_RANK		= 6;	// optional; Boolean
	
		// search parameters
	
	String	SP_SEARCH_NAME			 	= "t";	// String; title of search for display purposes
	String	SP_SEARCH_TERM			 	= "s";	// String
	String	SP_MATURE				 	= "m";	// Boolean
	String	SP_NETWORKS				 	= "n";	// String[]
	String	SP_MIN_SEEDS				= "z";	// Long
	String	SP_MIN_LEECHERS				= "l";	// Long
	
	SearchInstance
	search(
            Map<String, Object> search_parameters,
            SearchObserver observer)
	
		throws SearchException;
	
	Object
	getProperty(
            int property);
	
	void
	setProperty(
            int property,
            Object value);
}
