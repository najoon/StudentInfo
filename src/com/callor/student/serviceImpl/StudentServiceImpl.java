package com.callor.student.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.utils.Line;

public class StudentServiceImpl implements StudentService {
	protected final List<StudentVO> stList;
	protected final Scanner scan;

	public StudentServiceImpl() {
		scan = new Scanner(System.in);
		stList = new ArrayList<>();
	}

	@Override
	public void inputStudent() {

		while (true) {
			StudentVO stVO = new StudentVO();
			System.out.println(Line.dLine(50));
			System.out.println("학생정보 입력");
			
			
			System.out.print("학번(QUIT : 종료)>> ");
			String stNum = scan.nextLine();

			if (stNum.equals("QUIT")) {
				break;
			}

			System.out.print("이름");
			String stName = scan.nextLine();
			System.out.print("학과");
			String stDept = scan.nextLine();
			System.out.print("학년");
			String stGrade = scan.nextLine();
			Integer stuGrade = Integer.valueOf(stGrade);
			System.out.print("전화번호");
			String stTel = scan.nextLine();
			

			stVO.setStNum(stNum);
			stVO.setStName(stName);
			stVO.setStDept(stDept);
			stVO.setStGrade(stuGrade);
			stVO.setStTel(stTel);

			stList.add(stVO);

		}

	}

	@Override
	public void printStudent() throws IOException {
		
		String fileName = "/student/model/student.txt";

		InputStream file = new FileInputStream(fileName);
		Scanner scan = new Scanner(file);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(line);
		}

		scan.close();
		file.close();

	

	}

	@Override
	public void Studentadd() throws IOException {

		File file = new File("/StudentInfo/src/com/callor/student/model/student.txt");
		FileWriter fileweWriter = null;
		PrintWriter printWriter = null;

		fileweWriter = new FileWriter(file, true);
		printWriter = new PrintWriter(fileweWriter);

		for (StudentVO vo : stList) {
			printWriter.printf("%s:", vo.getStNum());
			printWriter.printf("%s:", vo.getStName());
			printWriter.printf("%s:", vo.getStDept());
			printWriter.printf("%s:", vo.getStGrade());
			printWriter.printf("%s\n", vo.getStTel());
		}

		printWriter.flush();
		printWriter.close();
		fileweWriter.close();

	}

}
