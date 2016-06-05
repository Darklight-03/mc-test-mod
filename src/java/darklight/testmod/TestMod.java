package darklight.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import darklight.testmod.util.Reference;

@Mod(modid=Reference.MODID,name=Reference.MODNAME,version=Reference.MODVER)
public class TestMod {
	@Instance(value=Reference.MODID)
	public static TestMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	public void load(FMLInitializationEvent event){
		
	}
	
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
