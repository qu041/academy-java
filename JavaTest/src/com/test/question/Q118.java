package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
	
	public static void main(String[] args) {
		
		String path ="C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\크기 정렬";
		
		File dir = new File(path);

        // 모든 파일을 담을 리스트
        ArrayList<File> flist = new ArrayList<>();

        // 재귀적으로 폴더를 탐색하면서 파일을 전부 수집
        addFile(dir, flist);

        // 크기 큰 순서대로 정렬 (버블 정렬 예제)
        for (int i = 0; i < flist.size() - 1; i++) {
            for (int j = 0; j < flist.size() - i - 1; j++) {
                if (flist.get(j).length() < flist.get(j + 1).length()) {
                    File temp = flist.get(j);
                    flist.set(j, flist.get(j + 1));
                    flist.set(j + 1, temp);
                }
            }
        }

        // 출력
        System.out.printf("%-30s\t%-10s\t%s\n", "[파일명]", "[크기]", "[폴더명]");
        System.out.println("----------------------------------------------------------------");

        for (File file : flist) {
            System.out.printf("%-30s\t%-10s\t%s\n",
                    file.getName(),
                    getSize(file.length()),
                    file.getParentFile().getName());
        }

    }

    // 재귀적으로 모든 파일을 찾아서 리스트에 추가
    private static void addFile(File dir, ArrayList<File> flist) {

        File[] list = dir.listFiles();
        if (list == null) return;  // 권한 없거나 비정상 경로 예외 방지

        // 파일 추가
        for (File file : list) {
            if (file.isFile()) {
                flist.add(file);
            }
        }

        // 폴더면 재귀적으로 또 조사
        for (File subdir : list) {
            if (subdir.isDirectory()) {
                addFile(subdir, flist);
            }
        }
    }

    // 파일 크기를 읽기 좋은 단위로 변환
    private static String getSize(long length) {
        if (length < 1024) {
            return length + "B";
        } else if (length < 1024 * 1024) {
            return String.format("%.1fKB", length / 1024.0);
        } else if (length < 1024L * 1024 * 1024) {
            return String.format("%.1fMB", length / 1024.0 / 1024.0);
        } else if (length < 1024L * 1024 * 1024 * 1024) {
            return String.format("%.1fGB", length / 1024.0 / 1024.0 / 1024.0);
        } else {
            return String.format("%.1fTB", length / 1024.0 / 1024.0 / 1024.0 / 1024.0);
        }
    }
}