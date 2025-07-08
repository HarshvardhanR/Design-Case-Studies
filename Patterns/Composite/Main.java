public class Main {
    public static void main(String[] args) {
        File file1 = new File("resume.pdf");
        File file2 = new File("cover_letter.docx");

        Folder documents = new Folder("Documents");
        documents.add(file1);
        documents.add(file2);

        File file3 = new File("photo.jpg");
        Folder pictures = new Folder("Pictures");
        pictures.add(file3);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(pictures);

        root.showDetails();
    }
}
