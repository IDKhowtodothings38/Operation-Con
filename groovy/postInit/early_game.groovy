mods.jei.yeet(item('icbmclassic:plate'));
mods.jei.yeet(item('icbmclassic:ingot'));
mods.jei.yeet(item('armorplus:steel_ingot'));
mods.jei.yeet(item('icbmclassic:clump'));
mods.jei.yeet(item('icbmclassic:circuit'));
mods.jei.yeet(item('icbmclassic:circuit', 1));
mods.jei.yeet(item('icbmclassic:circuit', 2));
mods.jei.yeet(item('icbmclassic:plate', 1));
mods.jei.yeet(item('icbmclassic:ingot', 1));

ore('circuitElite').add(item('industrialupgrade:circuit', 9));
ore('plateIron').add(item('industrialupgrade:itemplates', 22));
ore('ingotCopper').add(item('industrialupgrade:itemingots', 21));

crafting.removeByOutput(item('nocubessrparmory:rawcarbonsteel'));
crafting.removeByOutput(item('nocubessrparmory:carbonsteel'));
crafting.removeByOutput(item('armorplus:block_compressed_lava_crystal'));
crafting.removeByOutput(item('armorplus:block_compressed_infused_lava_crystal'));
crafting.removeByOutput(item('armorplus:compressed_obsidian'));
crafting.removeByOutput(item('armorplus:electrical_block'));
craftin.removeByOutput(item('armorplus:electrical_ingot'));


crafting.addShaped(item('nocubessrparmory:rawcarbonsteel'), [
        [item('industrialupgrade:itemingots', 23),item('nocubessrparmory:pestilentpart'),item('industrialupgrade:itemingots', 23)],
        [item('nocubessrparmory:pestilentpart'),item('industrialupgrade:itemingots', 23),item('nocubessrparmory:pestilentpart')],
        [item('industrialupgrade:itemingots', 23),item('nocubessrparmory:pestilentpart'),item('industrialupgrade:itemingots', 23)]]);
