package com.rabbit404.octopusx.hid.configfs;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class GadgetState {

    public final boolean octopusxGadgetExists;
    public final boolean octopusxGadgetBound;
    public final String boundUdc;
    public final Set<GadgetFunction> linkedFunctions;
    public final String massStorageFile;

    public GadgetState(boolean octopusxGadgetExists,
                       boolean octopusxGadgetBound,
                       String boundUdc,
                       Set<GadgetFunction> linkedFunctions,
                       String massStorageFile) {
        this.octopusxGadgetExists = octopusxGadgetExists;
        this.octopusxGadgetBound = octopusxGadgetBound;
        this.boundUdc = boundUdc;
        this.linkedFunctions = linkedFunctions == null
                ? Collections.unmodifiableSet(EnumSet.noneOf(GadgetFunction.class))
                : Collections.unmodifiableSet(EnumSet.copyOf(linkedFunctions));
        this.massStorageFile = massStorageFile;
    }
}
