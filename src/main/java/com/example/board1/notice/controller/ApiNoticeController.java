package com.example.board1.notice.controller;


import com.example.board1.notice.Model.NoticeInput;
import com.example.board1.notice.Model.ResponseError;
import com.example.board1.notice.entity.Notice;
import com.example.board1.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class ApiNoticeController {

    private final NoticeRepository noticeRepository;

//    @GetMapping("/api/notice")
//    public NoticeModel notice() {
//
//        LocalDateTime regDate = LocalDateTime.of(2023, 2, 23, 0, 0);
//
//        NoticeModel notice = new NoticeModel();
//        notice.setId(1);
//        notice.setTitle("공지사항입니다,");
//        notice.setContents("공지사항입니다1");
//        notice.setRegDate(regDate);
//
//        return notice;
//
//    }

//
//    @GetMapping("/api/notice")
//    public List<NoticeModel> notice() {
//        List<NoticeModel> noticeList = new ArrayList<>();
//
//        NoticeModel notice1 = new NoticeModel();
//        notice1.setId(1);
//        notice1.setTitle("공지사항 입니다");
//        notice1.setContents("공지사항내용입니다");
//        notice1.setRegDate(LocalDateTime.of(2023, 2, 23, 00, 00));
//        noticeList.add(notice1);
//
//        noticeList.add(NoticeModel.builder()
//                .id(2)
//                .title("빌더를 이용한 구문")
//                .contents("빌더를 이용한 컨텐츠")
//                .regDate(LocalDateTime.of(2023, 02, 23, 00, 00))
//                .build());
//
//
//        return noticeList;
//
//    }

//
//    @GetMapping("/api/notice")
//    public List<NoticeModel> notice() {
//        List<NoticeModel> noticeList = new ArrayList<>();
//
//        return noticeList;
//    }
//
//    @GetMapping("/api/notice/count")
//    public String noticeCount() {
//        return "10,220";
//    }

//    @PostMapping("/api/notice")
//    public NoticeModel addNotice( String title, String contents) {
//        NoticeModel notice = NoticeModel.builder()
//                .id(3)
//                .title(title)
//                .contents(contents)
//                .regDate(LocalDateTime.now())
//                .build();
//        return notice;
//    }

//
//    @PostMapping("/api/notice")
//    public NoticeModel addNotice(NoticeModel noticeModel) {
//        noticeModel.setId(2);
//        noticeModel.setRegDate(LocalDateTime.now());
//
//        return noticeModel;
//    }


//    @PostMapping("/api/notice")// json 형식으로 받기 위해서는 RequestBody를 써 줘야함
//    public NoticeModel addNotice(NoticeModel noticeModel) {
//        noticeModel.setId(3);
//        noticeModel.setRegDate(LocalDateTime.now());
//
//        return noticeModel;
//    }


//    @PostMapping("/api/notice")
//    public Notice addNotice(NoticeInput noticeInput) {
//        Notice notice = Notice.builder()
//                .title(noticeInput.getTitle())
//                .contents(noticeInput.getContents())
//                .regDate(LocalDateTime.now())
//                .build();
//
//        noticeRepository.save(notice);
//
//        return notice;
//    }
//
//    @PostMapping("/api/notice")
//    public Notice addNotice(@RequestBody NoticeInput noticeInput) {
//        Notice notice = Notice.builder()
//                .title(noticeInput.getTitle())
//                .contents(noticeInput.getContents())
//                .regDate(LocalDateTime.now())
//                .hits(0)
//                .likes(0)
//                .build();
//
//        noticeRepository.save(notice);
//
//        return notice;
//    }
//
//
//    @GetMapping("/api/notice/{id}")
//    public Notice notice(@PathVariable Long id) {
//
//        Optional<Notice> notice = noticeRepository.findById(id);
//        if (notice.isPresent()) {
//            return notice.get();
//        }
//
//        return null;
//    }


//    @PutMapping("/api/notice/{id}") // /api/notice/{id} PathVariable {id} 가변형때문에 PathVariable 사용
//    public void updateNotice(@PathVariable Long id,
//                            @RequestBody NoticeInput noticeInput) {
//
//        Optional<Notice> notice =
//                noticeRepository.findById(id);
//
//        if (notice.isPresent()) {
//            notice.get().setTitle(noticeInput.getTitle());
//            notice.get().setContents(noticeInput.getContents());
//            notice.get().setUpdateDate(LocalDateTime.now());
//            noticeRepository.save(notice.get());
//        }
//    }

//
//    @PutMapping("/api/notice/{id}")
//    public void updateNotice(@PathVariable Long id, @RequestBody NoticeInput noticeInput) throws NoticeNotFoundException {
//
//        Optional<Notice> notice = noticeRepository.findById(id);
//        if (!notice.isPresent()) {
//            //예외발생
//            throw new NoticeNotFoundException("공지사항 글이 존재하지 않습니다.");
//        }
//        notice.get().setTitle(noticeInput.getTitle());
//        notice.get().setContents(noticeInput.getContents());
//        notice.get().setUpdateDate(LocalDateTime.now());
//        noticeRepository.save(notice.get());
//
//    }
//
//
//    @PatchMapping("/api/notice/{id}/hits")
//    public void noticeHits(@PathVariable Long id) throws NoticeNotFoundException {
//        Notice notice = noticeRepository.findById(id)
//                .orElseThrow(() -> new NoticeNotFoundException("공지사항의 글이 존재하지 않습니다"));
//
//        notice.setHits(notice.getHits() + 1);
//        noticeRepository.save(notice);
//    }
//
//    @DeleteMapping("/api/notice/{id}")
//    public void deleteNotice(@PathVariable Long id) throws NoticeNotFoundException {
//      Notice notice = noticeRepository.findById(id)
//              .orElseThrow(() -> new NoticeNotFoundException("공지사항의 글이 존재하지 않습니다"));
//
//      noticeRepository.delete(notice);
//    }

//    @DeleteMapping("/api/notice")
//    public void deleteNoticeList(@RequestBody NoticeDeleteInput noticeDeleteInput) throws NoticeNotFoundException {
//
//        List<Notice> noticeList = noticeRepository.findByIdIn(noticeDeleteInput.getIdList())
//                .orElseThrow(() -> new NoticeNotFoundException("공지사항의 글이 존재하지 않습니다"));
//    }

//    @PostMapping("/api/notice")
//    public void addNotice(@RequestBody NoticeInput noticeInput) {
//        Notice notice = Notice.builder()
//                .title(noticeInput.getTitle())
//                .contents(noticeInput.getContents())
//                .hits(1)
//                .likes(1)
//                .regDate(LocalDateTime.now())
//                .build();
//
//        noticeRepository.save(notice);
//    }


    @PostMapping("/api/notice")
    public ResponseEntity<Object> addNotice(@RequestBody @Valid NoticeInput noticeInput
    , Errors errors) {

        if (errors.hasErrors()) {

           List<ResponseError> responseErrors  = new ArrayList<>();

           errors.getAllErrors().stream().forEach(e -> {
               ResponseError responseError = new ResponseError();
               responseError.setField(((FieldError)e).getField());
               responseError.setMessage(e.getDefaultMessage());
               responseErrors.add(responseError);
           });
           return new ResponseEntity<>(responseErrors, HttpStatus.BAD_REQUEST);
        }

        // 정상적인 저장 로직
        noticeRepository.save(Notice.builder()
                .title(noticeInput.getTitle())
                .contents(noticeInput.getContents())
                .regDate(LocalDateTime.now())
                .hits(1)
                .likes(1)
                .build());

        return ResponseEntity.ok().build();
    }


    @GetMapping("/api/notice/latest/{size}")
    public Page<Notice> noticeLatest(@PathVariable int size) {

        Page<Notice> noticeList =
        noticeRepository.findAll(PageRequest.of(0, size, Sort.Direction.DESC,
                "regDate"));

        return noticeList;
    }

}
