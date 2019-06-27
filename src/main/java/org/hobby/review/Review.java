package org.hobby.review;

public class Review {
    String position;
    String date;
    String interviewQuestions;
    String location;

    private Review(String position, String date, String interviewQuestions, String location) {
        this.position = position;
        this.date = date;
        this.interviewQuestions = interviewQuestions;
        this.location = location;
    }

// Come up with a Builder class.
}
