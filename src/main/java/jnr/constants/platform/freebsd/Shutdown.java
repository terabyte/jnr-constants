// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 15:25:11 -0800 2009
package jnr.constants.platform.freebsd;
public enum Shutdown implements jnr.constants.Constant {
SHUT_RD(0),
SHUT_WR(1),
SHUT_RDWR(2);
private final int value;
private Shutdown(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 2;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
