package com.teammokyuu.mc.vob.block;

import net.minecraftforge.fml.relauncher.Side;

public class Blocks {
	
	public static VoBCrafter vob_crafter;
	public static Infuser infuser;
	
	public static void setup( Side side ) {
		vob_crafter = (VoBCrafter)(new VoBCrafter( )).registerSelf( ).registerModel( side );
		infuser = (Infuser)(new Infuser( )).registerSelf( ).registerModel( side );
	}

}
