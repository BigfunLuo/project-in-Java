package bus;

public class Student {
    
	private int sid;
    private String fn;
    private String ln;
    private String email;
    private float firstfees;
    public Student() {
		
	}
    public Student(int sid, String fn, String ln, String email,float fee) {
	
		this.sid = sid;
		this.fn = fn;
		this.ln = ln;
		this.email = email;
		this.firstfees=fee;
	}
	public float getFirstfees() {
		return firstfees;
	}
	public void setFirstfees(float firstfees) {
		this.firstfees = firstfees;
	}

	public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fn=" + fn + ", ln=" + ln + ", email=" + email + ", firstfees=" + firstfees
				+ "]";
	}
	

}
