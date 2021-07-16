
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/OrderManager"

import StoreManager from "./components/StoreManager"

import CustomerManager from "./components/CustomerManager"

import MyPage from "./components/MyPage"
import DeliveryManager from "./components/DeliveryManager"

import PayManager from "./components/PayManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/Order',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/Store',
                name: 'StoreManager',
                component: StoreManager
            },

            {
                path: '/Customer',
                name: 'CustomerManager',
                component: CustomerManager
            },

            {
                path: '/MyPage',
                name: 'MyPage',
                component: MyPage
            },
            {
                path: '/Delivery',
                name: 'DeliveryManager',
                component: DeliveryManager
            },

            {
                path: '/Pay',
                name: 'PayManager',
                component: PayManager
            },



    ]
})
