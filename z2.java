class Reader {

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getNoBileta() {
		return noBileta;
	}

	public void setNoBileta(int noBileta) {
		this.noBileta = noBileta;
	}

	public String getFacultet() {
		return facultet;
	}

	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String fio;
	private int noBileta;
	private String facultet;
	private String dr;
	private String phone;
	
	public Reader(String fio, int noBileta, String facultet, String dr, String phone) {
		this.fio = fio;
		this.noBileta = noBileta;
		this.facultet = facultet;
		this.dr = dr;
		this.phone = phone;
	}
	
    private String bookWord(int kolich) {
        int mod10 = kolich % 10, mod100 = kolich % 100;
        if (mod10 == 1 && mod100 != 11) return " книгу";
        if (mod10 >= 2 && mod10 <= 4 && (mod100 < 12 || mod100 > 14)) return " книги";
        return " книг";
    }	
	public void takeBook(int kolich) {
		System.out.println(fio + " взял "+ kolich + bookWord(kolich));
	}
    public void takeBook(String... nazv) {
        System.out.println(fio + " взял книги: " + String.join(", ", nazv));
    }	
    
    public void returnBook(int kolich) {
        System.out.println(fio + " вернул " + kolich + bookWord(kolich));
    }

    // Перегрузка returnBook: nazv книг
    public void returnBook(String... nazv) {
        System.out.println(fio + " вернул книги: " + String.join(", ", nazv));
    }
}


public class z2 {

	public static void main(String[] args) {
		Reader[] читатели = new Reader[5];
		читатели[0] = new Reader("Городецкий А. С.", 1001, "facultet", "11.01.2001", "+7-800-555-35-35");
		читатели[1] = new Reader("Багров Д. С.", 1002, "facultet", "01.01.2000", "+7-934-987-67-67");
		читатели[2] = new Reader("Бойко М. Н.", 1003, "facultet", "22.02.2002", "+7-967-677-67-67");
		читатели[3] = new Reader("Ваздухан В. В.", 1004, "facultet", "31.03.2003", "+7-987-654-32-10");
		читатели[4] = new Reader("Газан Г. Г.", 1005, "facultet", "14.04.2004", "+7-977-887-77-71");
		
		
		читатели[0].takeBook(3);
		читатели[0].takeBook("Как создать ядерную бомбу в домашних условиях", "Как абатить тархун", "Физика 35 класса");

		читатели[1].takeBook(1);
		читатели[1].takeBook("Война и мир том на 100000000000000000000000 страниц");

		читатели[2].takeBook(2);
		читатели[2].takeBook("Java. Руководство по взлому Пентагона", "РОССИЯ, ПУТИН, ПОБЕДА");

		читатели[3].returnBook(3);
		читатели[3].returnBook("Ночной Дозор", "Дневной Дозор", "Брат");

		читатели[4].returnBook(1);
		читатели[4].returnBook("ЦОЙ ЖИВ", "Шафутинский Миша");

	
	
	}

}