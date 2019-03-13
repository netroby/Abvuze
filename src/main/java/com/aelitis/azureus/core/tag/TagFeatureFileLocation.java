/*
 * Created on May 21, 2013
 * Created by Paul Gardner
 * 
 * Copyright 2013 Azureus Software, Inc.  All rights reserved.
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


package com.aelitis.azureus.core.tag;

import java.io.File;

public interface 
TagFeatureFileLocation 
{
	long	FL_NONE			= 0x00;
	long	FL_DATA			= 0x01;
	long	FL_TORRENT		= 0x02;
	long	FL_BOTH			= FL_DATA | FL_TORRENT;
	long	FL_DEFAULT		= FL_DATA;
	
		// initial location
	
	boolean
	supportsTagInitialSaveFolder();
	
	File
	getTagInitialSaveFolder();
	
	void
	setTagInitialSaveFolder(
            File folder);
	
	long
	getTagInitialSaveOptions();
	
	void
	setTagInitialSaveOptions(
            long opions);
	
		// move 
	
	boolean
	supportsTagMoveOnComplete();
	
	File
	getTagMoveOnCompleteFolder();
	
	void
	setTagMoveOnCompleteFolder(
            File folder);
	
	long
	getTagMoveOnCompleteOptions();
	
	void
	setTagMoveOnCompleteOptions(
            long opions);
	
		// copy 
	
	boolean
	supportsTagCopyOnComplete();
	
	File
	getTagCopyOnCompleteFolder();
	
	void
	setTagCopyOnCompleteFolder(
            File folder);
	
	long
	getTagCopyOnCompleteOptions();
	
	void
	setTagCopyOnCompleteOptions(
            long opions);
}
