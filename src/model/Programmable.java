package model;

public interface Programmable {

    void setProgram(String programName, String programDetails);

    String getProgram(String programName);

    void removeProgram(String programName);

    boolean hasProgram(String programName);

}
