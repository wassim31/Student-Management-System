public enum GradeLevel {
    FRESHMAN,JUNIOR,SENIOR;

    @Override
    public String toString() {
        switch (this)
        {
            case FRESHMAN: return "FRESHMAN";
            case JUNIOR: return "JUNIOR";
            case SENIOR: return "SENIOR";
            default: return "Unspecified";
        }
    }
}
