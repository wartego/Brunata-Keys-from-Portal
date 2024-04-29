package pl.brunata.mapper;

import java.util.Arrays;
import java.util.List;

public enum MCIDNumberEnum {
    GROUP_801(Arrays.asList(
            "166082", "166083","166079","166080","166081","166084","167451","167456"
            ),
            "801"),
    GROUP_821(Arrays.asList("160927"), "821"),
    GROUP_761(Arrays.asList("166567","166568","166609","166610","166611","166612"),"761"),
    GROUP_762(Arrays.asList("167557","167558","167559","167560","167561","167562"),"762"),
    GROUP_1082(Arrays.asList("167187"),"1082"),
    GROUP_683(Arrays.asList("167186"),"683"),
    GROUP_1090(Arrays.asList("162457"),"1090"),
    GROUP_988(Arrays.asList("167274","167276"),"988");

    private final List<String> mcids;
    private final String mcidNumber;

    public List<String> getMcids() {
        return mcids;
    }

    public String getMcidNumber() {
        return mcidNumber;
    }

    MCIDNumberEnum(List<String> mcids, String mcidNumber) {
        this.mcids = mcids;
        this.mcidNumber = mcidNumber;
    }
}
