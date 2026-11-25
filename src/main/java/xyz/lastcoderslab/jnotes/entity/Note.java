package xyz.lastcoderslab.jnotes.entity;
import java.time.LocalDateTime;
import java.util.Date;
public class Note implements Comparable<Note>{
    private String title;
    private Integer number;
    private LocalDateTime date;
    private Note (Builder builder) {
        this.title = builder.title;
        this.number = builder.number;
        this.date = builder.date;
    }
    public static class Builder {
        private String title;
        private Integer number;
        private LocalDateTime date;
        public Builder(String title, Integer number, LocalDateTime date) {
            this.title = title;
            this.number = number;
            this.date = date;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder number(Integer number) {
            this.number = number;
            return this;
        }
        public Builder date(LocalDateTime date) {
            this.date = date;
            return this;
        }
        public Note build() {
            return new Note(this);
        }
    }
    @Override
    public int compareTo(Note note) {
        int cmp = this.title.compareTo(note.title);
        if (cmp != 0) return cmp;

        cmp = this.number.compareTo(note.number);
        if(cmp != 0) return cmp;

        return this.date.compareTo(note.date);
    }
}
