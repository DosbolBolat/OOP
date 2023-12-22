package OOP.Library;


import OOP.RequestSystem.Request;
import OOP.UserSystem.Student;

import java.util.*;

/**
* @generated
*/
public class Librarian implements ManageRequest {

    private Vector<Book> listOfBooks;
    private Queue<Request> listOfRequestsLibrary;

    public Librarian() {
        listOfBooks = new Vector<>();
        listOfRequestsLibrary = new LinkedList<>();
    }

    public boolean giveBook(Student student, Book book) {
        // Логика выдачи книги студенту
        if (listOfBooks.contains(book)) {
            student.receiveBook(book);
            listOfBooks.remove(book);
            System.out.println("Книга успешно выдана студенту " + student.getUsername());
            return true;
        } else {
            System.out.println("Книга не доступна для выдачи.");
            return false;
        }
    }


    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public boolean deleteBook(Book book) {
        return listOfBooks.remove(book);
    }

    public Request getRequest() {
        return listOfRequestsLibrary.poll();
    }

    public boolean respondRequest() {
        System.out.println("Обработка заявки:");
        if (!listOfRequestsLibrary.isEmpty()) {
            Request request = listOfRequestsLibrary.poll();

            switch (request.getStatus()) {
                case APPROVED:
                    System.out.println("Заявка утверждена. Выполняем дальнейшие действия.");
                    break;
                case REJECTED:
                    System.out.println("Заявка отклонена. Уведомляем пользователя.");
                    break;
                case COMPLETED:
                    System.out.println("Заявка выполнена. Подтверждаем завершение работы.");

                    break;
                case FAILED:
                    System.out.println("Заявка в файле. Архивируем информацию.");
                    break;
                default:
                    System.out.println("Неизвестный статус заявки.");
                    break;
            }

            request.viewRequest();
            System.out.println("Заявка успешно обработана.");
            return true;
        }
        System.out.println("Нет доступных заявок для обработки.");
        return false;
    }


    public Vector<Book> getListOfBooks() {
        return listOfBooks;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}
