-- tao co so du lieu 

CREATE DATABASE IF NOT EXISTS DoAnNhom10;
USE DoAnNhom10;

-- tao bang 
CREATE TABLE Member (
    id int(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    FisrtName nvarchar(30) NULL, 
    LastName nvarchar(30)  NULL, 
    UserName nvarchar(30) NOT NULL, 
    Email varchar(50) NOT NULL, 
    Password varchar(30) NOT NULL, 
    Phone varchar(13) NULL,  
    Description text(200) NULL, 
    CreatedDate datetime NULL, 
    UpdateTime datetime  NULL
) ENGINE = InnoDB;

CREATE TABLE Content (
   id int(10) UNSIGNED AUTO_INCREMENT NOT NULL, 
   Title text(200) NULL, 
   Brief text(150) NULL, 
   Content text(1000) NULL, 
   CreatedDate datetime  NULL, 
   UpdateTime datetime NULL, 
   Sort int NULL, 
   AuthorId int(10) UNSIGNED NOT NULL,
   PRIMARY KEY(id,AuthorId ),
   FOREIGN KEY (AuthorId) REFERENCES Member(id)
) ENGINE = InnoDB;

-- them du lieu cho bang Member

INSERT INTO Member(FisrtName,LastName,UserName,Email,Password,Phone,Description,CreatedDate,UpdateTime) VALUES('Tam','Nguyen Van','Van Tam','nguyentam123@gmail.com','123456789','0256895684','Tai khoan dau tien','2021-09-20 13:25:12','2021-09-20 23:15:12' );
INSERT INTO Member(FisrtName,LastName,UserName,Email,Password,Phone,Description,CreatedDate,UpdateTime) VALUES('Thang','Tran Quyet','Quyet Thang','quyetthang321@gmail.com','132456789','0256485692','Tai khoan thu hai','2021-10-20 14:21:10','2021-10-20 22:11:22' );
INSERT INTO Member(FisrtName,LastName,UserName,Email,Password,Phone,Description,CreatedDate,UpdateTime) VALUES('Hong','Bui Thi','Thi Hong','buihong456@gmail.com','142356789','0325698745','Tai khoan thu ba','2021-10-12 13:25:12','2021-10-12 23:15:12' );
INSERT INTO Member(FisrtName,LastName,UserName,Email,Password,Phone,Description,CreatedDate,UpdateTime) VALUES('Thien','Hoang Van','Van Thien','hoangthien789@gmail.com','152346789','0315262451','Tai khoan thu tu','2021-11-20 13:25:12','2021-11-20 23:15:12' );
INSERT INTO Member(FisrtName,LastName,UserName,Email,Password,Phone,Description,CreatedDate,UpdateTime) VALUES('Linh','Vo Thi Ngoc','Ngoc Linh','volinh987@gmail.com','162345789','0387545654','Tai khoan thu nam','2021-12-20 13:25:12','2021-12-20 23:15:12' );

-- them du lieu cho bang Content
INSERT INTO Content(Title,Brief,Content,CreatedDate,UpdateTime,Sort,AuthorId) VALUES('Louis Vuitton – Archligh','Một đôi Chunky đầu tiên trong BXH.','Xuất hiện trong Tuần lễ thời trang 2018, Archlight của Louis Vuitton là đôi sneaker đã thực sự gây được chú ý mạnh mẽ.
Phần đế được thiết kế oversize nhô lên mang đến sự êm ái và dẻo dai khi sử dụng. Nhờ vào sự vượt trội hơn hẳn về thiết kế mà Archlight đã dẫn đầu dòng luxury sneaker.','2021-09-20 13:25:12','2021-09-20 23:15:12',1,1);
INSERT INTO Content(Title,Brief,Content,CreatedDate,UpdateTime,Sort,AuthorId) VALUES('Balenciaga Triple S','Tuy sở hữu thân hình cục mịch và quá khổ nhưng Balenciaga Triple S là một trong những đôi giày thể thao đang hot hiện nay.','Tuy sở hữu thân hình cục mịch và quá khổ nhưng Balenciaga Triple S là một trong những đôi giày thể thao đang hot hiện nay.
Ngoài lớp da cao cấp, upper của nó còn được kết hợp những lớp vải dệt có nhiều gam màu khác nhau làm đôi giày thêm nổi bật hơn.
Đây là đôi chunky sneaker được yêu thích bởi đông đảo tín đồ thời trang và người nổi tiếng.','2021-10-20 14:21:10','2021-10-20 22:11:22',2,2);
INSERT INTO Content(Title,Brief,Content,CreatedDate,UpdateTime,Sort,AuthorId) VALUES('Alexander McQueen Oversized','Thoạt nhìn có vẻ hơi giống đôi sneaker huyền thoại Stan Smith của Adidas','Thoạt nhìn có vẻ hơi giống đôi sneaker huyền thoại Stan Smith của Adidas nhưng Alexander McQueen Oversized lại nổi trội hơn nhờ phần đế độn đặc biệt.
Hơn nữa, sự đa dạng về các phiên bản phối màu ngày một “chất” là điểm mấu chốt giúp đôi giày chiếm trọn sự trái tim của những tín đồ giày.','2021-10-12 13:25:12','2021-10-12 23:15:12',3,3);
INSERT INTO Content(Title,Brief,Content,CreatedDate,UpdateTime,Sort,AuthorId) VALUES('Sneaker thêu Gucci Ace Embroidered','Phiên bản thêu không bao giờ là lỗi thời','Phiên bản thêu không bao giờ là lỗi thời và luôn là một trong những đôi giày thể thao nữ đẹp nhấtđược săn đón ráo riết.
Siêu phẩm Gucci Ace Embroidered ra đời năm 2017 thực sự đã đánh dấu lại vị trí của Gucci trên thị trường.','2021-11-20 13:25:12','2021-11-20 23:15:12',4,4);
INSERT INTO Content(Title,Brief,Content,CreatedDate,UpdateTime,Sort,AuthorId) VALUES('Rhyton Gucci logo leather sneaker','cái tên đã có những đóng góp không nhỏ trong việc làm nên danh tiếng của Gucci.','Rhyton Gucci logo leather là cái tên đã có những đóng góp không nhỏ trong việc làm nên danh tiếng của Gucci.
Phiên bản này mang đậm phong cách streetwear, phần logo được in một cách rõ ràng, tỉ mỉ ngay ở phần má ngoài tạo sự sang trọng.
Phần lót cực kỳ dày dặn, xứng đáng là một trong những mẫugiày thể thao nữ hot nhất hiện nay.','2021-12-20 13:25:12','2021-12-20 23:15:12',5,5);


