#Menu클래스에 메뉴만들기와 메뉴오픈 함수 넣어보기.
from order import Order
from sales import Sales
class Menu:
    def __init__(self):
        #menu.txt를 찾아서 열고(ReadOnly)
        #메뉴정보를 읽어서 저장한다.
        self.Menu=[]
        try:
            f=open('D:/moon/Python/menu.txt','r')
        except:
            print('메뉴화일을 열 수 없습니다.')
            return
        line=f.readline()
        while line != '':
            ar=line.split(',')
            b1={'menu':ar[0],'price':int(ar[1])}
            self.Menu.append(b1)
            line = f.readline()
        f.close()
    
    
    def buildMenu(self):
        for b1 in self.Menu:
            print(b1['menu'],b1['price'])
        name = input('메뉴명: ')
        while name!='':
            price=input('가격: ')
            while not price.isnumeric():
                price=input('가격: ')
            price=int(price)
            self.Menu.append({'menu':name,'price':price})
            name=input('메뉴명: ')
        f=open('D:\moon\Python\menu.txt','w')
        for menu in self.Menu:
            f.write(menu['menu']+','+str(menu['price'])+'\n')
            print(menu['menu']+','+str(menu['price']))
        f.close()

    def save2file(self):
        f=open('D:\moon\Python\menu.txt','w')
        for menu in self.Menu:
            f.write(menu['menu']+','+str(menu['price'])+'\n')
            print(menu['menu']+','+str(menu['price']))
        f.close()

    def openMenu(self):
        menu=[]
        f=open('D:\moon\Python\menu.txt','r')
        line=f.readline()
        while line != '':
            ar=line.split(',')
            b1={'menu':ar[0],'price':int(ar[1])}
            menu.append(b1)
            line = f.readline()
        ndx = 1
        for b1 in menu:  
            print('%2d %-20s %7d원'%(ndx,b1['menu'],b1['price']))
            ndx+=1        
        f.close()
    
    def updateMenu(self):
        menu_num=input('메뉴번호: ')
        while not menu_num.isnumeric():
            menu_num=input('메뉴번호: ')
        menu_num = int(menu_num)-1
        name=input('새 메뉴명: ')
        price=input('가격: ')
        while not price.isnumeric():
            price=input('가격: ')
        price=int(price)
        self.Menu[menu_num]['menu']=name
        self.Menu[menu_num]['price']=price
        self.save2file()
    
    def deleteMenu(self):
        menu_num=input('삭제할 메뉴번호: ')
        while not menu_num.isnumeric():
            menu_num=input('삭제할 메뉴번호: ')
        menu_num = int(menu_num)-1
        del self.Menu[menu_num]
        self.save2file()

#클래스 인스턴스 생성
# buildMenu 호출
cafeMenu = Menu()  #메뉴정보를 읽어서 초기화.
# cafeMenu.buildMenu()
# cafeMenu.openMenu()
sales=Sales()



#1.주문관리 2. 메뉴관리 3.실적보기 0.종료
num=input('1.주문입력 2.메뉴관리 3.실적보기 0.종료 : ')
while num!='0':
    if num=='1':
        order=Order()
        cafeMenu.openMenu()
        order.build(cafeMenu.Menu)
        print('주문입력완료')
        #매출실적에 order.Order와 order.mobile 집어넣기
        sales.append(order.Order,order.mobile)  #append는 함수이름(붙이는 동사 아님)
    elif num=='2':
        num2=input('메뉴관리 - 1.추가 2.조회 3.수정 4.삭제 0.종료: ')
        while num2!='0':
            if num2=='1':
                cafeMenu.buildMenu()
            elif num2=='2':
                cafeMenu.openMenu()
            elif num2=='3':
                cafeMenu.updateMenu()
            elif num2=='4':
                cafeMenu.deleteMenu()
            else:
                print('작업입력오류')
            num2=input('메뉴관리 - 1.추가 2.조회 3.수정 4.삭제 0.종료: ')
        print('메뉴관리완료')
    elif num=='3':   
        sales.display()
        print('실적관리완료')
    else:
        print('작업입력오류')
    num=input('1.주문입력 2.메뉴관리 3.실적보기 0.종료 : ')
print('program terminated')