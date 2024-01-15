

//Items

def items_for_removal = [
        //Copper

];

items_for_removal.each { item ->
    mods.jei.removeAndHide(item);
}

//Plates

def plates_for_removal = [
        //Copper
        item('libvulpes:productplate', 4),
        //Tin
        item('libvulpes:productplate', 5)
];

plates_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('plate*').remove(item)
}

//Blocks
def blocks_for_removal = [
        //Copper
        item('libvulpes:metal0', 4),
        //Tin
        item('libvulpes:metal0', 5)
];

blocks_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('block*').remove(item)
}

//Sticks
def sticks_for_removal = [
        //Copper
        item('libvulpes:productrod', 4)
];

sticks_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('stick*').remove(item)
}

//Nuggets
def nuggets_for_removal = [
        //Copper
        item('libvulpes:productnugget', 4),
        //Tin
        item('libvulpes:productnugget', 5)
];

nuggets_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('nugget*').remove(item)
}

//Ore
def ore_for_removal = [
        //Copper
        item('libvulpes:ore0', 4),
        //Tin
        item('libvulpes:ore0', 5)
];

ore_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('ore*').remove(item)
}

//Dust
def dust_for_removal = [
        //Copper
        item('libvulpes:productdust', 4),
        item('enderio:item_material', 26),
        //Tin
        item('libvulpes:productdust', 5)
];

dust_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('dust*').remove(item)
}

//Ingot
def ingot_for_removal = [
        //Copper
        item('icbmclassic:ingot', 1),
        item('libvulpes:productingot', 4),
        //Tin
        item('libvulpes:productingot', 5)
];

ingot_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('ingot*').remove(item)
}

//Sheet
def sheet_for_removal = [
        //Copper
        item('libvulpes:productsheet', 4)
];

sheet_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('sheet*').remove(item)
}

//Coil
def coil_for_removal = [
        //Copper
        item('libvulpes:coil0', 4)
];

coil_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('coil*').remove(item)
//    ore('block*').remove(item)
}

//Wire
def wire_for_removal = [
        //Copper
        item('icbmclassic:wire')
];

wire_for_removal.each { item ->
    mods.jei.removeAndHide(item);
//    ore('wire*').remove(item)
}