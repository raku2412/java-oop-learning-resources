package model;

public class ExampleProgram implements Programmable {

    private String programName;
    private String programDetails;

    @Override
    public void setProgram(String programName, String programDetails) {
        this.programName = programName;
        this.programDetails = programDetails;
    }

    @Override
    public String getProgram(String programName) {
        if (this.programName.equals(programName)) {
            return this.programDetails;
        }
        return null;
    }

    @Override
    public void removeProgram(String programName) {
        if (this.programName.equals(programName)) {
            this.programName = null;
            this.programDetails = null;
        }
    }

    @Override
    public boolean hasProgram(String programName) {
        return this.programName != null && this.programName.equals(programName);
    }

}
