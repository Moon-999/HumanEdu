from datetime import datetime

class Sales:
    def __init__(self):
        self.Sales=[] #매출시각, 모바일 번호, 메뉴명, 수량, 금액
    def append(self,orderList,mobile): #cafeMenu에서 주문입력 후 주문리스트와 모바일을 집어넣는 함수
        today=datetime.now().strftime('%Y-%M-%D %H:%M:%S')
        for order in orderList:
            self.Sales.append({'sold_time':today,'mobile':mobile,\
                'menu':order['menu'],'qty':order['qty'],'total':order['total']})
        

    def display(self):
        grandTotal =0
        for sale in self.Sales:
            print('%-20s %11s %10s %2d %6d'%(sale['sold_time'],sale['mobile'],sale['menu'],sale['qty'],sale['total']))
            grandTotal+=sale['total']
        print('-'*50)
        print('총매출액: '+str(grandTotal))