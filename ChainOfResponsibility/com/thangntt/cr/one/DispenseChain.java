package com.thangntt.cr.one;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
