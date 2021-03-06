/*
 * Created on Feb 1, 2013
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


package org.gudy.azureus2.core3.stats.transfer;

import java.util.Date;

public interface 
LongTermStats 
{
	int ST_PROTOCOL_UPLOAD		= 0;
	int ST_DATA_UPLOAD			= 1;
	int ST_PROTOCOL_DOWNLOAD	= 2;
	int ST_DATA_DOWNLOAD		= 3;
	int ST_DHT_UPLOAD			= 4;
	int ST_DHT_DOWNLOAD			= 5;
	
	int PT_CURRENT_HOUR			= 0;
	int PT_CURRENT_DAY			= 1;
	int PT_CURRENT_WEEK			= 2;	// sun is start of week
	int PT_CURRENT_MONTH		= 3;
	
	int PT_SLIDING_HOUR			= 10;
	int PT_SLIDING_DAY			= 11;
	int PT_SLIDING_WEEK			= 12;

	String[] PT_NAMES =
		{ "hour", "day", "week", "month", "", "", "", "", "", "",
		  "sliding hour", "sliding day", "sliding week"
		};
	
	boolean
	isEnabled();
	
	long[]
	getCurrentRateBytesPerSecond();
	
	long[]
	getTotalUsageInPeriod(
            Date start_date,
            Date end_date);
	
	long[]
	getTotalUsageInPeriod(
            int period_type,
            double multiplier);
	
	long[]
	getTotalUsageInPeriod(
            int period_type,
            double multiplier,
            RecordAccepter accepter);
	
	void
	addListener(
            long min_delta_bytes,
            LongTermStatsListener listener);
	
	void
	removeListener(
            LongTermStatsListener listener);
	
	void
	reset();
	
	interface
	RecordAccepter
	{
		boolean
		acceptRecord(
                long timestamp);
	}
	
	interface
	GenericStatsSource
	{
		int
		getEntryCount();
		
		long[]
		getStats(
                String id);
	}
}
