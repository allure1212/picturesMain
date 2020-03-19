package com.kh.mem_code.model.vo;

import com.kh.common.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class MemCode {
   /* MEM_CODE */
   private int memCode;

   /* MEM_TYPE */
   private String memType;

   /* MEM_PRICE */
   private int memPrice;

   public boolean isEqualsMemType(String memType) {
	   if(StringUtils.isEmpty(memType)) {
		   return false;
	   }
	   return this.memType.equals(memType);
   }

}
