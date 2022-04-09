package pl.mzalewski.todoapp.model.task;


import com.zaxxer.hikari.util.ClockSource;
import org.apache.tomcat.jni.Local;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Filed can not be empty or contain only spaces")
    private String description;
    private boolean done;
    private LocalDateTime createDate;
    private Date startDate;
    private Date dueDate;
    private Date completedDate;

    public Task() {
        setCreateDate();
    }


    public LocalDateTime getCreateDate() {
        return createDate;
    }

    private void setCreateDate() {
    createDate = LocalDateTime.now();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate() {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
