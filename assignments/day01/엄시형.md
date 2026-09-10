# [TIL] Day 01 - Git & GitHub 첫걸음

- **작성자**: 엄시형 (SiHyeong Eom)
- **작성일**: 2026-09-09

---

## 1. 오늘 내가 직접 손으로 치며 배운 점
- `mkdir -p` 를 통해 하위 디렉터리를 생성할 때 필요한 상위 디렉터리까지 한번에 생성
- `git restore` 를 통해 마지막 커밋으로 되돌리는 기능
- `git commit --amend -m` 를 통해 커밋 메세지 수정
- 리눅스 쉘에서 특수문자를 일반 문자열로 입력하려면 \를 붙여야함

## 2. 가장 멘붕이었던 순간 & 트러블슈팅

- **문제 상황** : 글로벌 main -> master 브랜치 변경 후 init.defaultBranch가 두 개가 나오는 것을 확인
  
```shell
git config --list 

init.defaultbranch=main
init.defaultbranch=master

git config --show-origin --get-all init.defaultBranch

file:/Applications/Xcode.app/Contents/Developer/usr/share/git-core/gitconfig main # (Local)
file:/Users/esh/.gitconfig master # (Global)

```

- **원인 및 해결** : Git 설정 범위가 달라 글로벌 설정이 중복된 것처럼 보인 것 
  System, Global, Local 설정이 있다는 것을 확인 
  Xcode Git 설정이 main으로 잡고 있었던 것 (Local)

## 3. 나만의 언어로 재해석한 핵심 용어 사전