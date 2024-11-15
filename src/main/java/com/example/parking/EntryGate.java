package com.example.parking;

public enum EntryGate {
    GATE_A("GATE A", "entry"),
    GATE_B("GATE B", "entry"),
    GATE_C("GATE C", "exit"),
    GATE_D("GATE D", "exit");

    private final String gateName;
    private final String gateType;

    EntryGate(String gateName, String gateType) {
        this.gateName = gateName;
        this.gateType = gateType;
    }

    public String getGateName() {
        return gateName;
    }

    public String getGateType() {
        return gateType;
    }
}