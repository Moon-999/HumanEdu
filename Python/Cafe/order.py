class Order:
    def __init__(self):
        self.Order=[]
        self.mobile=''
    def build(self, menulist):
        grandTotal=0
        #메뉴번호 읽기
        menu_num=input('메뉴번호 입력: ')
        while menu_num!='':
            if not menu_num.isnumeric():
                menu_num=input('메뉴번호 입력: ')
                continue
            menu_num=int(menu_num)-1
            #수량 읽기
            qty=input('수량 입력: ')
            while not qty.isnumeric():
                qty=input('수량 입력: ')
            qty=int(qty)
            #금액계산
            total=menulist[menu_num]['price']*qty
            print(f'금액: {total}원 ')
            grandTotal=grandTotal+total
            self.Order.append({'menu':menulist[menu_num]['menu'],'qty':qty,'total':total})
            menu_num=input('메뉴번호 입력: ')
        print(f'총 금액: {grandTotal}원')
        self.mobile = input('적립 모바일 번호: ')