// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import jdk.internal.misc.Unsafe;

import sun.util.logging.PlatformLogger;
public class XTimeCoord extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XTimeCoord(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XTimeCoord() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public long get_time() { log.finest("");return (Native.getULong(pData+0)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+0, v); }
	public short get_x() { log.finest("");return (Native.getShort(pData+8)); }
	public void set_x(short v) { log.finest(""); Native.putShort(pData+8, v); }
	public short get_y() { log.finest("");return (Native.getShort(pData+10)); }
	public void set_y(short v) { log.finest(""); Native.putShort(pData+10, v); }


	String getName() {
		return "XTimeCoord"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(120);

		ret.append("time = ").append( get_time() ).append(", ");
		ret.append("x = ").append( get_x() ).append(", ");
		ret.append("y = ").append( get_y() ).append(", ");
		return ret.toString();
	}


}



