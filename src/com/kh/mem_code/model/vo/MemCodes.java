package com.kh.mem_code.model.vo;

import java.util.List;

import lombok.Getter;

@Getter
public class MemCodes {

	private List<MemCode> memCodes;
	
	public MemCodes(List<MemCode> memCodes) {
		this.memCodes = memCodes;
	}
	
	public Integer findCostByType(String memType) {
		for(MemCode memCode : this.memCodes) {
			if(memCode.isEqualsMemType(memType)){
				return memCode.getMemPrice();
			}
		}
		return null;
	}
}
