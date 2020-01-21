package com.lws.android.jiayou;

import java.util.ArrayList;
import java.util.Arrays;

public class DataLoader {
    public static ArrayList<Sentence> loadSentences(String stage, String part) {
        ArrayList<Sentence> sentences = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("您喝什么饮料？", "Nín hē shénme yǐnliào?", "무슨 음료를 마시겠습니까?"));
                        sentences.add(new Sentence("我喝橙汁。", "Wǒ hē chéngzhī.", "저는 오렌지주스를 마시겠습니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("有橙汁，苹果汁和芒果汁。", "Yǒu chéngzhī, píngguǒ zhī hé mángguǒ zhī.", "오렌지주스, 사과주스와 망고주스가 있습니다."));
                        sentences.add(new Sentence("我喝苹果汁。", "Wǒ hē píngguǒzhī.", "저는 사과주스를 마시겠습니다."));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("您喝咖啡还是喝绿茶？", "Nín hē kāfēi háishì hē lǜchá?", "당신은 커피를 마시겠습니까? 아니면 녹차를 마시겠습니까?"));
                        sentences.add(new Sentence("我喝咖啡。", "Wǒ hē kāfēi.", "저는 커피를 마시겠습니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("我喝美式咖啡 。", "Wǒ hē měishì kāfēi.", "저는 아메리카노를 마시겠습니다."));
                        sentences.add(new Sentence("我要两杯红茶。", "Wǒ yào liǎng bēi hóngchá.", "저는 홍차 2잔을 원합니다."));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("要加糖和奶吗？", "yào jiā táng hé nǎi ma?", "설탕, 크림을 넣으시겠습니까?"));
                        sentences.add(new Sentence("我只要糖。", "Wǒ zhǐ yào táng.", "저는 설탕만 필요합니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("要加冰块吗？", "Yào jiā bīng kuài ma?", "얼음을 넣으시겠습니까?"));
                        sentences.add(new Sentence("我不要加冰块。", "Wǒ búyào jiā bīng kuài.", "저는 얼음을 넣는 것을 원하지 않습니다."));
                        sentences.add(new Sentence("请慢用.", "qǐng màn yòng.", "맛있게 드십시오."));
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("今天有两种餐食。", "Jīn tiān yǒu liǎng zhǒng cān shí.", "오늘은 두 종류의 식사가 있습니다."));
                        sentences.add(new Sentence("您喜欢吃哪种？", "Nín xǐ huān chī nǎ zhǒng ？", "어떤 종류를 드시겠습니까?"));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("我吃牛肉盖饭。", "Wǒ chī niúròu gài fàn.", "저는 소고기 덮밥을 먹겠습니다."));
                        sentences.add(new Sentence("太淡了。", "Tài dàn le.", "너무 싱겁습니다."));
                        sentences.add(new Sentence("请给我盐.", "Qǐng gěi wǒ yán.", "소금을 주십시오."));
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("牛肉盖饭没有了。", "Niúròu gài fàn méiyǒule", "소고기 덮밥이 소진되었습니다."));
                        sentences.add(new Sentence("吃鸡肉盖饭怎么样?", "Chī jīròu gài fàn zěnme yàng?", "닭고기 덮밥을 드시는 것은 어떠십니까?"));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("吃好了吗？", "Chī hǎole ma?", "다 드셨습니까?"));
                        sentences.add(new Sentence("把餐盘可以拿走吗?", "Bǎ cān pán kěyǐ ná zǒu ma?", "가져가도 되겠습니까?"));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("你预订过特殊餐吗?", "Nǐ yùdìng guò tèshūcān ma?", "스페셜 밀을 주문하신 적이 있습니까?"));
                        sentences.add(new Sentence("这是您预订的婴儿餐。", "Zhè shì nín yùdìng de yīng'ér cān.", "당신이 주문하신 베이비밀입니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("这是您预订的儿童餐。", "Zhè shì nín yùdìng de értóng cān.", "이것은 당신이 주문한 아동식입니다."));
                        sentences.add(new Sentence("还需要什么吗？", "Hái xūyào shénme ma?", "더 필요 한 것이 있습니까?"));
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("我有点儿冷。", "Wǒ yǒudiǎnr lěng.", "저는 조금 춥습니다."));
                        sentences.add(new Sentence("请给我毛毯。", "Qǐng gěi wǒ máotǎn.", "담요를 주세요."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("耳机好像坏了。", "ěrjī hǎoxiàng huài le", "이어폰이 고장난 것 같습니다."));
                        sentences.add(new Sentence("我马上给您换新的.", "wǒ mǎshàng gěi nín huàn xīn de.", "제가 곧 새것을 바꾸어 드리겠습니다."));
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("这是入境卡。", "zhè shì rù jìng kǎ。", "이것은 입국신고서입니다."));
                        sentences.add(new Sentence("每个人都要填写1张入境卡。", "měi ge rén dōu yào tián xiě yì zhāng rù jìng kǎ 。", "모든 사람이 1장의 입국신고서를 작성하셔야 합니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("这是海关申报单。", "zhè shì hǎi guān shēn bào dān 。", "이것은 세관신고서입니다."));
                        sentences.add(new Sentence("一家人填写一张就行。", "Yì jiā rén tiánxiě yì zhāng jiùxíng.", "가족당 1장을 작성하시면 됩니다."));
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("我想买口红。", "Wǒ xiǎng mǎi kǒuhóng.", "저는 립스틱을 사고 싶습니다."));
                        sentences.add(new Sentence("您要买哪种颜色的口红?", "Nín yào mǎi nǎ zhǒng yánsè de kǒuhóng?", "어떤 색상의 립스틱을 구매하시겠습니까?"));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("我想介绍给您这瓶香水。", "Wǒ xiǎng jièshào gěi nín zhè píng xiāngshuǐ.", "저는 이 향수를 추천하고 싶습니다."));
                        sentences.add(new Sentence("这瓶香水受到很多人的欢迎。", "zhè píng xiāng shuǐ shòu dào hěn duō rén de huān yíng 。", "이 향수는 많은 사람들에게 인기가 있습니다."));
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("人民币多少钱？", "Rénmínbì duōshǎo qián?", "인민폐로 얼마입니까?"));
                        sentences.add(new Sentence("这是100块人民币。", "Zhè shì yì bǎi kuài rénmínbì.", "이것은 인민폐 100위안입니다."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("今天的汇率是多少？", "Jīntiān de huìlǜ shì duōshǎo?", "오늘 환율이 얼마입니까?"));
                        sentences.add(new Sentence("1美元等于1200韩币。", "Yì měiyuán děngyú yì qiān èr bǎi hánbì.", "1달러는 한화로 1200원입니다.。Yì měiyuán děngyú yì qiān èr bǎi hánbì."));
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("想怎么结算呢？", "Xiǎng zěnme jiésuàn ne?", "어떻게 계산하시겠습니까?"));
                        sentences.add(new Sentence("我想用人民币结算。", "Wǒ xiǎng yòng rénmínbì jiésuàn.", "인민폐로 계산하겠습니다.Wǒ xiǎng yòng rénmínbì jiésuàn."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("我想用信用卡结算。", "Wǒ xiǎng yòng xìn yòng kǎ jiésuàn.", "저는 신용카드로 계산하려고 합니다."));
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("请给我您的护照和信用卡。", "Qǐng gěi wǒ nín de hù zhào hé xìn yòng kǎ 。请给我您的护照和信用卡。", "여권과 카드를 주시겠습니까?"));
                        sentences.add(new Sentence("请在这里签名。", "Qǐng zài zhèlǐ qiānmíng.", "이곳에 서명해 주십시오."));
                        break;
                    case Constants.PART_2:
                        sentences.add(new Sentence("这是零钱20块人民币。", "zhè shì líng qián èr shí kuài rén mín bì 。", "이것은 잔돈 20위안입니다."));
                        sentences.add(new Sentence("请您确认一下。", "Qǐng nín quèrèn yíxià.", "확인해 주십시오."));
                        break;
                }
                break;
        }
        return sentences;
    }

    public static ArrayList<Word> loadWords(String stage, String part) {
        ArrayList<Word> words = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("您", "nín", "당신", R.raw.nin));
                        words.add(new Word("喝", "hē", "마시다", R.raw.he));
                        words.add(new Word("什么", "shénme", "무엇", R.raw.shenme));
                        words.add(new Word("饮料", "yǐnliào", "음료", R.raw.yinliao));
                        words.add(new Word("橙汁", "chéngzhī", "오렌지 주스", R.raw.chengzhi));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("有", "Yǒu", "있다", R.raw.you));
                        words.add(new Word("可乐", "kě lè", "콜라", R.raw.kele));
                        words.add(new Word("雪碧", "xuě bì", "사이다", R.raw.xuebi));
                        words.add(new Word("矿泉水", "kuàng quán shuǐ", "물", R.raw.kuangquanshui));
                        words.add(new Word("橙汁", "chéng zhī", "오렌지 주스", R.raw.chengzhi));
                        words.add(new Word("苹果汁", "píng guǒ zhī", "사과 주스", R.raw.pingguozhi));
                        words.add(new Word("芒果汁", "mángguǒ zhī", "망고 주스", R.raw.mangguozhi));
                        words.add(new Word("番茄汁", "fān qié zhī", "토마토 주스", R.raw.fanqiezhi));
                        words.add(new Word("啤酒", "pí jiǔ", "맥주", R.raw.pijiu));
                        words.add(new Word("葡萄酒", "pú táo jiǔ", "와인", R.raw.putaojiu));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("喝", "hē", "마시다", R.raw.he));
                        words.add(new Word("咖啡", "kāfēi", "커피", R.raw.kafei));
                        words.add(new Word("还是", "háishì", "~아니면", R.raw.haishi));
                        words.add(new Word("绿茶", "lǜchá", "녹차", R.raw.lucha));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("美式咖啡", "měishì kāfēi", "아메리카노", R.raw.ameri));
                        words.add(new Word("要", "yào", "필요하다, 원하다", R.raw.yao));
                        words.add(new Word("红茶", "hóngchá", "홍차", R.raw.hongcha));
                        words.add(new Word("奶茶", "nǎichá", "밀크티", R.raw.naicha));
                        words.add(new Word("拿铁", "ná tiě", "라떼", R.raw.natie));
                        words.add(new Word("杯", "bēi", "잔, 컵", R.raw.bei));
                        words.add(new Word("本", "běn", "권", R.raw.ben));
                        words.add(new Word("本子", "běn zi", "노트", R.raw.benzi));
                        words.add(new Word("件", "jiàn", "벌", R.raw.jian));
                        words.add(new Word("衣服", "yīfú", "옷", R.raw.yifu));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("要", "yào", "원하다", R.raw.yao));
                        words.add(new Word("加", "jiā", "더하다", R.raw.jia));
                        words.add(new Word("糖", "táng", "설탕", R.raw.tang));
                        words.add(new Word("和", "hé", "~와", R.raw.he2));
                        words.add(new Word("奶", "nǎi", "크림, 우유", R.raw.nai));
                        words.add(new Word("只", "zhǐ", "단지", R.raw.zhi));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("要", "yào", "원하다", R.raw.yao));
                        words.add(new Word("加", "jiā", "더하다", R.raw.jia));
                        words.add(new Word("不", "bù", "부정의 표시", R.raw.bu));
                        words.add(new Word("冰块", "bīng kuài", "얼음", R.raw.bingkuai));
                        words.add(new Word("柠檬", "níngméng", "레몬", R.raw.ningmeng));
                        words.add(new Word("牛奶", "niúnǎi", "우유", R.raw.niunai));
                        words.add(new Word("请", "qǐng", "청하다", R.raw.qing));
                        words.add(new Word("慢", "màn", "느리다", R.raw.man));
                        words.add(new Word("用", "yòng", "드시다", R.raw.yong));
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("今天", "Jīn tiān", "오늘", R.raw.jintian));
                        words.add(new Word("有", "yǒu", "있다", R.raw.you));
                        words.add(new Word("两", "liǎng", "둘", R.raw.liang));
                        words.add(new Word("种", "zhǒng", "종류", R.raw.zhong));
                        words.add(new Word("餐食", "cān shí", "식사", R.raw.canshi));
                        words.add(new Word("喜欢", "xǐ huān", "좋아하다", R.raw.xihuan));
                        words.add(new Word("哪", "nǎ", "어느", R.raw.na));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("牛肉", "niúròu", "소고기", R.raw.niurou));
                        words.add(new Word("盖饭", "gài fàn", "덮밥", R.raw.gaifan));
                        words.add(new Word("太…了", "tài…le", "너무 ~하다", R.raw.taile));
                        words.add(new Word("淡", "dàn", "싱겁다", R.raw.dan));
                        words.add(new Word("给", "gěi", "주다", R.raw.gei));
                        words.add(new Word("盐", "yán", "소금", R.raw.yan));
                        words.add(new Word("黄油", "huángyóu", "버터", R.raw.huangyou));
                        words.add(new Word("胡椒", "hújiāo", "후추", R.raw.hujiao));
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("牛肉盖饭", "niúròu gàifàn", "소고기 덮밥",R.raw.sogogi));
                        words.add(new Word("没有", "méiyǒu", "없다", R.raw.meiyou));
                        words.add(new Word("了", "le", "변화", R.raw.le));
                        words.add(new Word("鸡肉", "jīròu", "닭고기", R.raw.jirou));
                        words.add(new Word("怎么样", "zěnme yàng", "어떠한가", R.raw.zenmeyang));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("好了", "hǎo le", "다 했다", R.raw.haole));
                        words.add(new Word("把", "bǎ", "전치", R.raw.ba));
                        words.add(new Word("餐盘", "cān pán", "식사 트레이", R.raw.canpan));
                        words.add(new Word("可以", "kěyǐ", "가능하다", R.raw.keyi));
                        words.add(new Word("拿走", "ná zǒu", "가져가다", R.raw.nazpu));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("预订", "yùdìng", "예약하다", R.raw.yuding));
                        words.add(new Word("过", "guò", "경험", R.raw.guo));
                        words.add(new Word("特殊餐", "tèshūcān", "special meal", R.raw.teshucan));
                        words.add(new Word("婴儿餐", "yīng'ér cān", "BBML", R.raw.yingercan));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("预订", "yùdìng", "예약하다", R.raw.yuding));
                        words.add(new Word("儿童餐", "értóng cān", "Child Meal", R.raw.ertongcan));
                        words.add(new Word("素食", "sù shí", "Vegetarian Meal", R.raw.sushi));
                        words.add(new Word("溃疡餐", "kuì yáng cān", "Bland Meal", R.raw.kuiyangcan));
                        words.add(new Word("穆斯林餐", "mù sī lín cān", "Muslim Meal", R.raw.muslim));
                        words.add(new Word("犹太餐", "yóu tài cān", "Kosher Meal", R.raw.youtaican));
                        words.add(new Word("印度餐", "yìn dù cān", "Hindu Meal", R.raw.yinducan));
                        words.add(new Word("还", "hái", "또, 더", R.raw.hai));
                        words.add(new Word("需要", "xūyào", "필요하다", R.raw.xuyao));
                        words.add(new Word("什么", "shénme", "무엇", R.raw.shenme));
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("有点儿", "yǒudiǎnr", "조금", R.raw.youdianr));
                        words.add(new Word("冷", "lěng", "춥다", R.raw.leng));
                        words.add(new Word("给", "gěi", "~에게,주다", R.raw.gei));
                        words.add(new Word("毛毯", "máotǎn", "담요", R.raw.maotan));
                        words.add(new Word("头疼", "tóuténg", "머리가 아프다", R.raw.touteng));
                        words.add(new Word("止疼片", "zhǐ téng piàn", "진통제", R.raw.zhitengpian));
                        words.add(new Word("拖鞋", "tuōxié", "슬리퍼", R.raw.tuoxie));
                        words.add(new Word("眼罩", "yǎnzhào", "안대", R.raw.yanzhao));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("耳机", "ěrjī", "이어폰", R.raw.erji));
                        words.add(new Word("好像", "hǎoxiàng", "~인 것 같다", R.raw.haoxiang));
                        words.add(new Word("坏", "huài", "고장나다", R.raw.huai));
                        words.add(new Word("马上", "mǎshàng", "곧", R.raw.mashang));
                        words.add(new Word("换", "huàn", "바꾸다", R.raw.huan));
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("入境卡", "rù jìng kǎ", "입국신고서", R.raw.rujingka));
                        words.add(new Word("每个人", "měi ge rén", "매 사람", R.raw.meigeren));
                        words.add(new Word("都", "dōu", "모두", R.raw.dou));
                        words.add(new Word("要", "yào", "~해야한다", R.raw.yao));
                        words.add(new Word("填写", "tián xiě", "작성하다", R.raw.jintian));
                        words.add(new Word("张", "zhāng", "장", R.raw.zhang));
                        words.add(new Word("检疫申报单", "jiǎnyì shēnbào dān", "검역신고서", R.raw.jianyi));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("海关申报单", "hǎi guān shēn bào dān", "세관신고서", R.raw.haiguan));
                        words.add(new Word("家人", "jiā rén", "식구", R.raw.jiaren));
                        words.add(new Word("填写", "tián xiě", "작성하다", R.raw.tianxie));
                        words.add(new Word("张", "zhāng", "장", R.raw.zhang));
                        words.add(new Word("就行", "jiù xíng", "~하면 된다", R.raw.jiuxing));
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("想", "xiǎng", "~하고싶다", R.raw.xiang));
                        words.add(new Word("买", "mǎi", "사다", R.raw.mai));
                        words.add(new Word("口红", "kǒuhóng", "립스틱", R.raw.kouhong));
                        words.add(new Word("要", "yào", "~하려고 하다", R.raw.yao));
                        words.add(new Word("哪", "nǎ", "어느", R.raw.na));
                        words.add(new Word("种", "zhǒng", "종류", R.raw.zhong));
                        words.add(new Word("颜色", "yánsè", "색상", R.raw.yanse));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("想", "xiǎng", "~하고싶다", R.raw.xiang));
                        words.add(new Word("介绍", "jièshào", "소개하다",R.raw.jieshao ));
                        words.add(new Word("给", "gěi", "~에게", R.raw.gei));
                        words.add(new Word("瓶", "píng", "병", R.raw.ping));
                        words.add(new Word("香水", "xiāng shuǐ", "향수", R.raw.xiangshui));
                        words.add(new Word("欢迎", "huān yíng", "환영", R.raw.huanying));
                        words.add(new Word("收到", "shòu dào", "받다", R.raw.shoudao));
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("人民币", "Rénmínbì", "인민폐", R.raw.renminbi));
                        words.add(new Word("多少", "duōshǎo", "얼마", R.raw.duoshao));
                        words.add(new Word("钱", "qián", "돈", R.raw.qian));
                        words.add(new Word("块", "kuài", "화폐단위 (소수점 윗자리)", R.raw.kuai));
                        words.add(new Word("毛", "máo", "화폐단위 (소수점 첫째자리)", R.raw.mao));
                        words.add(new Word("分", "fēn", "화폐단위 (소수점 둘째자리)", R.raw.fen));
                        words.add(new Word("百", "bǎi", "백", R.raw.bai));
                        words.add(new Word("千", "qiān", "천", R.raw.qian));
                        words.add(new Word("万", "wàn", "만", R.raw.wan));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("汇率", "huìlǜ", "환율", R.raw.huilu));
                        words.add(new Word("多少", "duōshǎo", "얼마", R.raw.duoshao));
                        words.add(new Word("美元", "měiyuán", "달러", R.raw.meiyuan));
                        words.add(new Word("等于", "děngyú", "해당하다", R.raw.dengyu));
                        words.add(new Word("韩币", "hánbì", "한화", R.raw.hanbi));
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("想", "xiǎng", "~하려하다", R.raw.xiang));
                        words.add(new Word("怎么", "zěnme", "어떻게", R.raw.zenme));
                        words.add(new Word("用", "yòng", "사용하다", R.raw.yong));
                        words.add(new Word("人民币", "rénmínbì", "인민폐", R.raw.renminbi));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("想", "xiǎng", "~하려 하다", R.raw.xiang));
                        words.add(new Word("用", "yòng", "사용하다", R.raw.yong));
                        words.add(new Word("信用卡", "xìn yòng kǎ", "신용카드", R.raw.xinongka));
                        words.add(new Word("韩币", "hán bì", "원화", R.raw.hanbi));
                        words.add(new Word("美元", "měi yuán", "달러", R.raw.meiyuan));
                        words.add(new Word("欧元", "ōu yuán", "유로화",R.raw.ouyuan));
                        words.add(new Word("日元", "rì yuán", "엔화", R.raw.riyuan));
                        words.add(new Word("现金", "xiàn jīn", "현금", R.raw.xianjin));
                        words.add(new Word("结算", "jiésuàn", "계산하다", R.raw.jiesuan));
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("给", "gěi", "주다", R.raw.gei));
                        words.add(new Word("护照", "hù zhào", "여권", R.raw.huzhao));
                        words.add(new Word("和", "hé", "~와", R.raw.he2));
                        words.add(new Word("信用卡", "xìn yòng kǎ", "신용카드", R.raw.xinongka));
                        words.add(new Word("在", "zài", "~에", R.raw.zai));
                        words.add(new Word("这里", "zhèlǐ", "이곳", R.raw.zheli));
                        words.add(new Word("签名", "qiānmíng", "서명하다", R.raw.qianming));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("零钱", "líng qián", "잔돈",R.raw.lingqian));
                        words.add(new Word("人民币", "rén mín bì", "인민폐", R.raw.renminbi));
                        words.add(new Word("韩币", "hán bì", "원화", R.raw.hanbi));
                        words.add(new Word("美元", "měi yuán", "달러", R.raw.meiyuan));
                        words.add(new Word("确认", "quèrèn", "확인하다",R.raw.queren));
                        words.add(new Word("一下", "yíxià", "한번 ~하다", R.raw.yixia));
                        break;
                }
                break;
        }
        return words;
    }

    public static ArrayList<Blank> loadBlanks(String stage, String part) {
        ArrayList<Blank> blanks = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("您 (__) 什么 饮料？", "Nín (__) shénme yǐnliào?", "당신은 무슨 음료를 마시겠습니까?", "喝"));
                        blanks.add(new Blank("您 喝 什么 (__)？", "Nín hē shénme (__)?", "당신은 무슨 음료를 마시겠습니까?", "饮料"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 오렌지주스를 마시겠습니다. ", "橙汁"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("有  橙汁，苹果汁 (__) 芒果汁。", "Yǒu chéngzhī, píngguǒzhī (__) mángguǒzhī.", "오렌지주스, 사과주스와 망고주스가 있습니다.", "和"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 사과주스를 마시겠습니다.", "苹果汁"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 콜라를 마시겠습니다.", "可乐"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 토마토주스를 마시겠습니다.", "番茄汁"));
                        blanks.add(new Blank("我 喝 (__) 。", "Wǒ hē (__).", "저는 맥주를 마시겠습니다.", "啤酒"));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("您 (__) 咖啡 还是 喝 绿茶？", "Nín (__) kāfēi háishì hē lǜchá?", "당신은 커피를 마시겠습니까? 아니면 차를 마시겠습니까?", "喝"));
                        blanks.add(new Blank("您 喝 咖啡 (__) 喝 绿茶？", "Nín hē kāfēi (__) hē lǜchá?", "당신은 커피를 마시겠습니까? 아니면 차를 마시겠습니까?", "还是"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 커피를 마시겠습니다.", "咖啡"));
                        blanks.add(new Blank("我 喝 (__) 。", "Wǒ hē (__).", "저는 녹차를 마시겠습니다.", "绿茶"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē (__).", "저는 아메리카노를 마시겠습니다.", "美式咖啡"));
                        blanks.add(new Blank("我 要 两 (__) 红茶.", "Wǒ yào liǎng (__) hóngchá.", "저는 홍차 2잔을 원합니다.", "杯"));
                        blanks.add(new Blank("我 (__) 两 杯 拿铁.", "Wǒ (__) liǎng bēi ná tiě", "저는 라떼 2잔을 원합니다.", "要"));
                        blanks.add(new Blank("三 (__) 本子", "sān (__) běn zi", "세 권의 노트", "本"));
                        blanks.add(new Blank("五 (__) 衣服", "wǔ (__) yīfú", "다섯 벌의 옷", "件"));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("(__) 加 糖 和 奶 吗？", "(__) jiā táng hé nǎi ma?", "설탕, 크림을 넣으시겠습니까?", "要"));
                        blanks.add(new Blank("要 (__) 糖 和 奶 吗？", "yào (__) táng hé nǎi ma?", "설탕, 크림을 넣으시겠습니까?", "加"));
                        blanks.add(new Blank("我 (__) 要 加 糖。", "Wǒ (__) yào jiā táng.", "저는 설탕만 필요합니다.", "只"));
                        blanks.add(new Blank("我 只 要 (__)。", "Wǒ zhǐ yào (__).", "저는 설탕만 필요합니다.", "加糖"));
                        blanks.add(new Blank("我 只 要 (__)。", "Wǒ zhǐ yào (__).", "저는 설탕만 필요합니다.", "加奶"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("(__) 冰块 吗？", "(__) bīng kuài ma?", "얼음을 넣으시겠습니까?", "要加"));
                        blanks.add(new Blank("要 加 (__) 吗？", "Yào jiā (__) ma?", "우유를 넣으시겠습니까?", "牛奶"));
                        blanks.add(new Blank("我 (__) 加 冰块。", "Wǒ (__) jiā bīng kuài.", "저는 얼음을 넣는 것을 원하지 않습니다.", "不要"));
                        blanks.add(new Blank("我 不 要 加 (__)。", "Wǒ bú yào jiā (__).", "저는 레몬을 넣는 것을 원하지 않습니다.", "柠檬"));
                        blanks.add(new Blank("请 (__) 用！", "Qǐng (__) yòng! 慢", "맛있게 드십시오.", "慢"));
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("今天 有 两 种 (__)。", "Jīn tiān yǒu liǎng zhǒng (__).", "오늘은 두 종류의 식사가 있습니다.", "餐食"));
                        blanks.add(new Blank("今天 有 (__) 餐食。", "Jīn tiān yǒu (__) cān shí.", "오늘은 두 종류의 식사가 있습니다.", "两种"));
                        blanks.add(new Blank("您 喜欢 吃 (__)？", "Nín xǐ huān chī (__)？", "어떤 종류를 드시겠습니까?", "哪种"));
                        blanks.add(new Blank("您 (__) 吃 哪种？", "Nín (__) chī nǎ zhǒng？", "어떤 종류를 드시겠습니까?", "喜欢"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 吃 (__) 盖饭。", "Wǒ chī (__) gàifàn.", "저는 소고기 덮밥을 먹겠습니다.", "牛肉"));
                        blanks.add(new Blank("(__) 淡 了。", "(__) dan le.", "너무 싱겁습니다.", "太"));
                        blanks.add(new Blank("太 (__) 了。", "Tai (__) le.", "너무 싱겁습니다.", "淡"));
                        blanks.add(new Blank("请 (__) 我 盐.", "Qǐng (__) wǒ yán.", "소금을 주십시오.", "给"));
                        blanks.add(new Blank("请 给 我 (__).", "Qǐng gěi wǒ (__).", "소금을 주십시오.", "盐"));
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("(__) 盖饭 没有 了。", "(__) gàifàn méiyǒu le", "소고기 덮밥이 소진되었습니다.", "牛肉"));
                        blanks.add(new Blank("盖饭 没有 (__)。", "Niúròu gàifàn méiyǒu (__)", "소고기 덮밥이 소진되었습니다.", "了"));
                        blanks.add(new Blank("(__)鸡肉盖饭怎么样?", "(__) jīròu gài fàn zěnme yàng?", "닭고기 덮밥을 드시는 것은 어떠십니까?", "吃"));
                        blanks.add(new Blank("吃鸡肉盖饭(__)?", "Chī jīròu gài fàn (__)?", "닭고기 덮밥을 드시는 것은 어떠십니까?", "怎么样"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("吃 (__) 吗？", "Chī (__) ma?", "다 드셨습니까?", "好了"));
                        blanks.add(new Blank("(__) 餐盘 可以 拿走 吗?", "(__) cānpán kěyǐ názǒu ma?", "가져가도 되겠습니까?", "把"));
                        blanks.add(new Blank("把 餐盘 可以 (__) 吗?", "Bǎ cānpán kěyǐ (__) ma?", "가져가도 되겠습니까?", "拿走"));
                        blanks.add(new Blank("把 (__) 可以 拿走 吗?", "Bǎ (__) kěyǐ názǒu ma?", "가져가도 되겠습니까?", "把"));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("你  (__)  过  特殊餐  吗? ", " Nǐ  (__)   guò   tèshūcān   ma? ", "스페셜 밀을 주문하신 적이 있습니까?", "预定"));
                        blanks.add(new Blank("你 预订 (__)  特殊餐  吗? ", " Nǐ  yùdìng   (__)   tèshūcān   ma? ", "스페셜 밀을 주문하신 적이 있습니까?", " 过"));
                        blanks.add(new Blank("你 预订 过  (__)  吗? ", " Nǐ  yùdìng   guò   (__)   ma? ", "스페셜 밀을 주문하신 적이 있습니까?", "特殊餐"));
                        blanks.add(new Blank("这  是  您 预订 的  (__).", "Zhè  shì  nín  yùdìng  de (__). ", "당신이 주문하신 베이비밀입니다.", "婴儿餐 "));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("这 是 您 (__) 的 儿童餐.", "Zhè shì nín (__) de értóngcān. ", "이것은 당신이 주문한 아동식입니다.", " 预订"));
                        blanks.add(new Blank("这  是   您   预订  的  (__).", "Zhè shì nín yùdìng de (__).", "이것은 당신이 주문한 아동식입니다.", "儿童餐 "));
                        blanks.add(new Blank("还  (__)  什么  吗？", " Hái (__) shénme ma?", "더 필요 한 것이 있습니까?", " 需要 "));
                        blanks.add(new Blank("(__)  需要  什么  吗？", "(__) xūyào shénme ma? ", "더 필요 한 것이 있습니까?", "还"));

                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("我 (__) 冷。 ", " Wǒ (__)  lěng.", "저는 조금 춥습니다", "有点儿"));
                        blanks.add(new Blank("请 给 我 (__)。", " Qǐng gěi wǒ (__).", "담요를 주세요", "毛毯"));
                        blanks.add(new Blank("我 有点儿 (__)。", " Wǒ yǒudiǎnr (__).", "저는 머리가 조금 아픕니다", "头疼"));
                        blanks.add(new Blank("请 给 我  (__) 。 ", "Qǐng gěi wǒ (__).", "안대를 주세요", "眼罩"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("耳机 好像 (__).", "ěrjī hǎoxiàng (__)", "이어폰이 고장난 것 같습니다", "坏了"));
                        blanks.add(new Blank("耳机 (__) 坏了.", "ěrjī (__) huàile", "이어폰이 고장난 것 같습니다", "好像"));
                        blanks.add(new Blank("我 马上 给 您 (__) 新的.", "Wǒ mǎshàng gěi nín (__) xīnde.", "제가 곧 새것을 바꾸어 드리겠습니다.", "换"));
                        blanks.add(new Blank("我 (__) 给 您 换 新的.", "Wǒ (__) gěi nín huàn xīnde.", "제가 곧 새것을 바꾸어 드리겠습니다.", "马上"));

                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("这 是 入境卡", "zhè shì rùjìngkǎ.", "이것은 입국신고서입니다.", "入境卡"));
                        blanks.add(new Blank("每个人 都 要 (__) 1张 入境卡.", "měigerén dōu yào (__) yì  zhāng rù jìng kǎ.", "모든 사람이 1장의 입국신고서를 작성하셔야 합니다. ", "填写"));
                        blanks.add(new Blank("每个人 都 (__) 填写 1张 入境卡.", "měigerén  dōu (__) tián xiě yì  zhāng rù jìng kǎ.", "모든 사람이 1장의 입국신고서를 작성하셔야 합니다.", "要"));
                        blanks.add(new Blank("(__) 都 要 填写 1张 入境卡.", "(__)  dōu yào tián xiě yì  zhāng rù jìng kǎ.", "모든 사람이 1장의 입국신고서를 작성하셔야 합니다.", "每个人"));
                        blanks.add(new Blank("", "", "", ""));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("这 是 (__).", "Zhè shì (__)", "이것은 세관신고서입니다.", "海关申报单"));
                        blanks.add(new Blank("(__) 填写一张就行.", "(__) tiánxiě yì zhāng jiùxíng", "가족당 1장을 작성하시면 됩니다.", "一家人"));
                        blanks.add(new Blank("一家人填写一张 (__)", "Yì jiā rén tiánxiě yì zhāng (__)", "가족당 1장을 작성하시면 됩니다.", "就行"));
                        blanks.add(new Blank("一家人 (__) 一张就行", "Yì jiā rén (__) yì zhāng jiùxíng", "가족당 1장을 작성하시면 됩니다.", "填写"));
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("我 想买 (__).", "Wǒ xiǎng mǎi (__)", "저는 립스틱을 사고 싶습니다.", "口红"));
                        blanks.add(new Blank("您 要买 哪种 (__) 的 口红?", "Nín yàomǎi nǎzhǒng (__) de kǒuhóng? ", "어떤 색상의 립스틱을 구매하시겠습니까?", "颜色"));
                        blanks.add(new Blank("我  (__) 口红.", " Wǒ (__) kǒuhóng.", "저는 립스틱을 사고 싶습니다.", "想买"));
                        blanks.add(new Blank("您  要买  (__) 颜色  的  口红?", "Nín  yàomǎi  (__)   yánsè   de  kǒuhóng? ", "어떤 색상의 립스틱을 구매하시겠습니까? ", "哪种 "));

                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 想 (__) 给您 这 瓶 香水.", "Wǒ xiǎng (__) gěinín zhè ping xiāngshuǐ.", "저는 이 향수를 추천하고 싶습니다.", "介绍"));
                        blanks.add(new Blank("我  想  介绍  给您  这  (__)  香水.", "Wǒ xiǎng jièshào gěinín zhè (__) xiāngshuǐ.", "저는 이 향수를 추천하고 싶습니다.", "瓶"));
                        blanks.add(new Blank("这瓶香水 受到 很多人的 (__).", "zhè píng xiāngshuǐ shòudào hěnduō rén de (__).", "이 향수는 많은 사람들에게 인기가 있습니다.", "欢迎"));
                        blanks.add(new Blank("这瓶香水 (__) 很多人的 欢迎.", "zhè píng xiāngshuǐ (__) hěnduō rén de huān yíng.", "이 향수는 많은 사람들에게 인기가 있습니다.", "受到"));
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("(__) 多少 钱？", "(__) duōshǎo qián?", "인민폐로 얼마입니까?", "人民币"));
                        blanks.add(new Blank("人民币 (__) 钱？", " Rénmínbì (__) qián?", "인민폐로 얼마입니까?", "人民币"));
                        blanks.add(new Blank("这 是 100 (__) 人民币.", "Zhè shì yìbǎi (__) rénmínbì", "이것은 인민폐 100위안입니다.", "块"));
                        blanks.add(new Blank("这 是 100 块 (__).", "Zhè shì yìbǎi kuài (__)", "이것은 인민폐 100위안입니다.", "人民币"));

                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("今天  的 (__) 是 多少?", "Jīntiān de (__) shì duōshǎo?", "오늘 환율이 얼마입니까?", "汇率"));
                        blanks.add(new Blank("今天  的 汇率 是 (__)?", "Jīntiān de huìlǜ shì (__)?", "오늘 환율이 얼마입니까?", "多少"));
                        blanks.add(new Blank("1 美元 (__) 1200 韩币", "Yì měiyuán (__) yìqiānèrbǎi hánbì.", "1달러는 한화로 1200원입니다", "等于"));
                        blanks.add(new Blank("1 (__) 等于 1200 韩币", "Yì (__) děngyú yìqiānèrbǎi hánbì.", "1달러는 한화로 1200원입니다", "美元"));
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("想  怎么  (__)   呢？", "Xiǎng  zěnme (__) ne?", "어떻게 계산하시겠습니까?", "结算"));
                        blanks.add(new Blank("我 想 (__) 人民币 结算.", "Wǒ xiǎng (__) rénmínbì jiésuàn.", "인민폐로 계산하겠습니다.", "用"));
                        blanks.add(new Blank("想  (__)  结算   呢？", "Xiǎng  (__) jiésuàn ne?", "어떻게 계산하시겠습니까?", "怎么"));
                        blanks.add(new Blank("我 想 用 人民币 (__).", "Wǒ xiǎng yòng rénmínbì (__).", "인민폐로 계산하겠습니다.", "结算"));

                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 想 用 (__) 结算", "Wǒ xiǎng yòng (__) jiésuàn.", "저는 신용카드로 계산하려고 합니다", "信用卡"));
                        blanks.add(new Blank("我 想 (__) 信用卡 结算", "Wǒ xiǎng (__) xìnyòngkǎ jiésuàn.", "저는 신용카드로 계산하려고 합니다", "用"));
                        blanks.add(new Blank("我  想 用 (__) 结算", "Wǒ xiǎng yòng hán bì jiésuàn.", "저는 원화로 계산하려고 합니다.", "韩币"));
                        blanks.add(new Blank("我  想 用 金现 结算", "Wǒ xiǎng yòng xiàn jīn jiésuàn.", "저는 현금으로 계산하려고 합니다.", "金现"));

                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("请 给我 您的 (__) 和 信用卡.", "Qǐng gěi wǒ nín de  (__) hé xìnyòngkǎ", "여권과 카드를 주시겠습니까?", "护照"));
                        blanks.add(new Blank("请 在 (__)  签名.", "Qǐng zài (__) qiānmíng.", "이곳에 서명해 주십시오.", "这里"));
                        blanks.add(new Blank("请 给我 您的 护照 (__) 信用卡.", "Qǐng gěi wǒ nín de  hùzhà (__) xìnyòngkǎ", "여권과 카드를 주시겠습니까?", "和"));
                        blanks.add(new Blank("请 在 这里  (__).", "Qǐng zài zhèlǐ (__).", "이곳에 서명해 주십시오.", "签名"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("这 是 (__) 20块 人民币.", "Zhè  shì língqián  èrshí kuài  rén mín bì.", "이것은 잔돈 20위안입니다.", "零钱"));
                        blanks.add(new Blank("请  您 (__) 一下.", "Qǐng nín quèrèn yíxià.", "확인해 주십시오. ", "确认"));
                        blanks.add(new Blank("这 是 零钱 20(__) 人民币.", "Zhè  shì língqián  èrshí (__)  rén mín bì.", "이것은 잔돈 20위안입니다.", "块"));
                        blanks.add(new Blank("这 是 零钱 20块 (__).", "Zhè  shì língqián  èrshí kuài (__).", "이것은 잔돈 20위안입니다.", "人民币"));

                        break;
                }
                break;
        }
        return blanks;
    }

    public static ArrayList<ArrangeData> loadArrangeData(String stage, String part) {
        ArrayList<ArrangeData> data = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("무슨 음료를 마시겠습니까?", Arrays.asList("您", "喝", "什么", "饮料")));
                        data.add(new ArrangeData("저는 오렌지 주스를 마시겠습니다.", Arrays.asList("我", "喝", "橙汁")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("오렌지주스, 사과주스와 망고주스가 있습니다.",Arrays.asList("有","橙汁","苹果汁","和","芒果汁")));
                        data.add(new ArrangeData("저는 와인을 마시겠습니다.",Arrays.asList("我","喝","葡萄酒")));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("당신은 커피를 마시겠습니까? 아니면 녹차를 마시겠습니까? ",Arrays.asList("您","喝咖啡","还是","喝绿茶")));
                        data.add(new ArrangeData("저는 커피를 마시겠습니다.",Arrays.asList("我","喝","咖啡")));

                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("저는 아메리카노를 마시겠습니다.",Arrays.asList("我","喝","美式咖啡")));
                        data.add(new ArrangeData("저는 홍차 2잔을 원합니다.",Arrays.asList("我要","两","杯","红茶")));
                        data.add(new ArrangeData("공책 5권",Arrays.asList("五","本","本子")));
                        data.add(new ArrangeData("옷 3 벌",Arrays.asList("三","件","衣服")));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("설탕, 크림을 넣으시겠습니까?",Arrays.asList("要加","糖","和","奶吗？")));
                        data.add(new ArrangeData("저는 설탕만 필요합니다.",Arrays.asList("我","只","要","加糖")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("얼음을 넣으시겠습니까?",Arrays.asList("要加","冰块","吗")));
                        data.add(new ArrangeData("저는 얼음을 넣는 것을 원하지 않습니다.",Arrays.asList("我","不要","加","冰块")));
                        data.add(new ArrangeData("맛있게 드십시오.",Arrays.asList("请","慢","用")));

                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("오늘은 두 종류의 식사가 있습니다.",Arrays.asList("今天","有","两种","餐食")));
                        data.add(new ArrangeData("어떤 종류를 드시겠습니까?",Arrays.asList("您","喜欢","吃","哪种")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("저는 소고기 덮밥을 먹겠습니다.",Arrays.asList("我","吃","牛肉","盖饭")));
                        data.add(new ArrangeData("너무 싱겁습니다.",Arrays.asList("太","淡","了")));
                        data.add(new ArrangeData("소금을 주십시오.",Arrays.asList("请","给","我","盐")));

                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("소고기 덮밥이 소진되었습니다.",Arrays.asList("牛肉","盖饭","没有","了")));
                        data.add(new ArrangeData("닭고기 덮밥을 드시는 것은 어떠십니까?",Arrays.asList("吃","鸡肉","盖饭","怎么样")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("다 드셨습니까?",Arrays.asList("吃","好","了","吗")));
                        data.add(new ArrangeData("가져가도 되겠습니까?",Arrays.asList("把","餐盘","可以","拿走","吗")));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("스페셜 밀을 주문하신 적이 있습니까? ",Arrays.asList("你","过","特殊餐","吗")));
                        data.add(new ArrangeData("당신이 주문하신 베이비밀입니다.",Arrays.asList("这是","您 预订","的","婴儿餐 ")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("이것은 당신이 주문한 아동식 밀입니다",Arrays.asList("这是","您预定","的","儿童餐")));
                        data.add(new ArrangeData("더 필요 한 것이 있습니까?",Arrays.asList("还","需要","什么","吗")));
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("저는 조금 춥습니다.",Arrays.asList("我","有点儿","冷")));
                        data.add(new ArrangeData("담요를 주세요",Arrays.asList("请","给","我","毛毯 ")));

                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("이어폰이 고장난 것 같습니다.",Arrays.asList("耳机","好像","坏","了")));
                        data.add(new ArrangeData("제가 곧 새것을 바꾸어 드리겠습니다.",Arrays.asList("我马上","给您","换","新的")));
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("이것은 입국신고서입니다.",Arrays.asList("这","是","入境卡")));
                        data.add(new ArrangeData("모든 사람이 1장의 입국신고서를 작성하셔야 합니다.",Arrays.asList("每个人","都要","填写","1张入境卡")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("이것은 세관신고서입니다.",Arrays.asList("这 是","海关","申报单")));
                        data.add(new ArrangeData("가족당 1장을 작성하시면 됩니다.",Arrays.asList("一家人","填写","一张","就行")));
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("저는 립스틱을 사고 싶습니다.",Arrays.asList("我","想","买","口红")));
                        data.add(new ArrangeData("어떤 색상의 립스틱을 구매하시겠습니까?",Arrays.asList("您","要买","哪种","颜色的","口红")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("저는 이 향수를 추천하고 싶습니다.",Arrays.asList("我想","介绍给您","这瓶","香水")));
                        data.add(new ArrangeData("이 브랜드의 향수는 많은 사람들에게 인기가 있습니다.",Arrays.asList("这瓶香水","受到","很多人的","欢迎")));
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("인민폐로 얼마입니까?",Arrays.asList("人民币","多少","钱")));
                        data.add(new ArrangeData("이것은 인민폐 100위안입니다.",Arrays.asList("这是","100","块","人民币")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("오늘 환율이 얼마입니까?",Arrays.asList("今天的","汇率","是","多少")));
                        data.add(new ArrangeData("1달러는 한화로 1200원입니다.",Arrays.asList("1美元","等于","1200","韩币")));
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("어떻게 계산하시겠습니까?",Arrays.asList("想","怎么","结算","呢")));
                        data.add(new ArrangeData("인민폐로 계산하겠습니다.",Arrays.asList("我想","用","人民币","结算")));
                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("저는 신용카드로 계산하려고 합니다.",Arrays.asList("我想","用","信用卡","结算")));
                        data.add(new ArrangeData("저는 원화로 계산하려고 합니다.",Arrays.asList("我","想用","韩币","结算")));

                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        data.add(new ArrangeData("여권과 카드를 주시겠습니까?",Arrays.asList("请给我","您的","护照和","信用卡")));
                        data.add(new ArrangeData("이곳에 서명해 주십시오.",Arrays.asList("请","在","这里","签名")));

                        break;
                    case Constants.PART_2:
                        data.add(new ArrangeData("이것은 잔돈 20위안입니다.",Arrays.asList("这是","零钱","20块","人民币")));
                        data.add(new ArrangeData("확인해 주십시오.",Arrays.asList("请","您","确认","一下")));
                        break;
                }
                break;
        }
        return data;
    }

    public static ArrayList<hskWord> loadHskWordData(int stage) {
        ArrayList<hskWord> data = new ArrayList<>();
    switch (stage){
        case 1:
            data.add(new hskWord("阿姨","이모, 아주머니","āyí"));
            data.add(new hskWord("啊","문장 끝에 쓰여 어기를 도움(감탄)","a"));
            data.add(new hskWord("矮","(키)작다, (높이)낮다","ǎi"));
            data.add(new hskWord("爱","사랑하다 ","ài"));
            data.add(new hskWord("爱好","취미","àihào"));
            data.add(new hskWord("安静","조용하다","ānjìng"));
            data.add(new hskWord("八","여덟","bā"));
            data.add(new hskWord("把","~을(목적어를 동사 앞으로 전치시킴) ","bǎ"));
            data.add(new hskWord("爸爸","아빠","bàba"));
            data.add(new hskWord("吧","문장 끝에 쓰여 제의, 부탁 등의 어기를 나타냄","ba"));
            data.add(new hskWord("白","희다","bái"));
            data.add(new hskWord("百","백","bǎi"));
            data.add(new hskWord("班","반, 그룹","bān"));
            data.add(new hskWord("搬","운반하다","bān"));
            data.add(new hskWord("半","절반","bàn"));
            data.add(new hskWord("办法","방법","bànfǎ"));
            data.add(new hskWord("办公室","사무실","bàngōngshì"));
            data.add(new hskWord("帮忙","도움을 주다","bāngmáng"));
            data.add(new hskWord("帮助","돕다","bāngzhù"));
            data.add(new hskWord("包","(종이나 천으로)싸다; 꾸러미","bāo"));
            data.add(new hskWord("饱","배부르다; 충분히","bǎo"));
            data.add(new hskWord("报纸","신문","bàozhǐ"));
            data.add(new hskWord("杯子","컵","bēizi"));
            data.add(new hskWord("北方","북부 지역","běifāng"));
            data.add(new hskWord("北京","베이징","Běijīng"));

            data.add(new hskWord("被","이불; 덮다; ~에게 ~를 당하다","bèi"));
            data.add(new hskWord("本","책; 근본","běn"));
            data.add(new hskWord("鼻子","코","bízi"));
            data.add(new hskWord("比","비교하다","bǐ"));
            data.add(new hskWord("比较","비교적","bǐjiào"));
            data.add(new hskWord("比赛","경기(하다)","bǐsài"));
            data.add(new hskWord("必须","반드시 ~해야 한다","bìxū"));
            data.add(new hskWord("变化","변화(하다) ","biànhuà"));
            data.add(new hskWord("表示","표시하다","biǎoshì"));
            data.add(new hskWord("表演","공연하다","biǎoyǎn"));
            data.add(new hskWord("别","이별하다; 구별하다","bié"));
            data.add(new hskWord("别人","타인","biéren"));
            data.add(new hskWord("宾馆","호텔","bīnguǎn"));
            data.add(new hskWord("冰箱","냉장고","bīngxiāng"));
            data.add(new hskWord("不客气","사양하지 않다; 천만에요","búkèqi"));
            data.add(new hskWord("不","부정부사","bù"));
            data.add(new hskWord("才","재능; 겨우","cái"));
            data.add(new hskWord("菜","야채; 반찬","cài"));
            data.add(new hskWord("菜单","메뉴","càidān"));
            data.add(new hskWord("参加","참가하다","cānjiā"));
            data.add(new hskWord("草","풀","cǎo"));
            data.add(new hskWord("层","층, 겹","céng"));
            data.add(new hskWord("茶","차","chá"));
            data.add(new hskWord("差","부족하다","chà"));
            data.add(new hskWord("长","(길이, 시간 등이)길다","cháng"));

            data.add(new hskWord("唱歌","노래 부르다","chànggē"));
            data.add(new hskWord("超市","슈퍼마켓","chāoshì"));
            data.add(new hskWord("衬衫","셔츠","chènshān"));
            data.add(new hskWord("成绩","성적","chéngjì"));
            data.add(new hskWord("城市","도시","chéngshì"));
            data.add(new hskWord("吃","먹다","chī"));
            data.add(new hskWord("迟到","지각하다","chídào"));
            data.add(new hskWord("出","나가다","chū"));
            data.add(new hskWord("出现","출현하다","chūxiàn"));
            data.add(new hskWord("出租车","택시","chūzūchē"));
            data.add(new hskWord("厨房","주방","chúfáng"));
            data.add(new hskWord("除了","~을 제외하고","chúle"));
            data.add(new hskWord("穿","(옷을)입다, (신발을)신다","chuān"));
            data.add(new hskWord("船","선박","chuán"));
            data.add(new hskWord("春","봄","chūn"));
            data.add(new hskWord("词语","글자, 어휘","cíyǔ"));
            data.add(new hskWord("次","번, 차례","cì"));
            data.add(new hskWord("聪明","총명하다,","cōngming"));
            data.add(new hskWord("从","~부터","cóng"));
            data.add(new hskWord("错","틀리다","cuò"));
            data.add(new hskWord("打电话","전화를 걸다","dǎdiànhuà"));
            data.add(new hskWord("打篮球","농구를 하다","dǎlánqiú"));
            data.add(new hskWord("打扫","청소하다","dǎsǎo"));
            data.add(new hskWord("打算","계획(하다)","dǎsuan"));
            data.add(new hskWord("大","크다","dà"));

            data.add(new hskWord("大家","모두","dàjiā"));
            data.add(new hskWord("带","(몸에) 휴대하다","dài"));
            data.add(new hskWord("担心","걱정하다","dānxīn"));
            data.add(new hskWord("蛋糕","케이크","dàngāo"));
            data.add(new hskWord("但是","그러나","dànshì"));
            data.add(new hskWord("当然","당연하다","dāngrán"));
            data.add(new hskWord("到","도착하다","dào"));
            data.add(new hskWord("地","단어나 구가 상황어로 쓰여 동사/형용사를 수식함","de"));
            data.add(new hskWord("的","~의, ~의 것","de"));
            data.add(new hskWord("得","술어 뒤에 쓰여 결과나 정도를 나타내는 보어를 연결","de"));
            data.add(new hskWord("灯","등, 등불","dēng"));
            data.add(new hskWord("等","기다리다; 등(열거)","děng"));
            data.add(new hskWord("低","(높이)낮다","dī"));
            data.add(new hskWord("弟弟","남동생","dìdi"));
            data.add(new hskWord("地方","장소","dìfang"));
            data.add(new hskWord("地铁","지하철","dìtiě"));
            data.add(new hskWord("地图","지도","dìtú"));
            data.add(new hskWord("第一","첫 번째","dìyī"));
            data.add(new hskWord("点","시간의 단위","diǎn"));
            data.add(new hskWord("电脑","컴퓨터","diànnǎo"));
            data.add(new hskWord("电视","TV","diànshì"));
            data.add(new hskWord("电梯","엘리베이터","diàntī"));
            data.add(new hskWord("电影","영화","diànyǐng"));
            data.add(new hskWord("电子邮件","이메일","diànzǐyóujiàn"));
            data.add(new hskWord("东","동쪽","dōng"));

            break;

        case  2 :
            data.add(new hskWord("东西","물건","dōngxi"));
            data.add(new hskWord("冬","겨울","dōng"));
            data.add(new hskWord("懂","이해하다","dǒng"));
            data.add(new hskWord("动物","동물","dòngwù"));
            data.add(new hskWord("都","모두","dōu"));
            data.add(new hskWord("读","읽다; 공부하다","dú"));
            data.add(new hskWord("短","(길이) 짧다","duǎn"));
            data.add(new hskWord("段","(가늘고 긴 물건의) 토막","duàn"));
            data.add(new hskWord("锻炼","단련하다","duànliàn"));
            data.add(new hskWord("对","~에 대하여, ~에게; 옳다","duì"));
            data.add(new hskWord("对不起","미안하다","duìbuqǐ"));
            data.add(new hskWord("多","많다","duō"));
            data.add(new hskWord("多么","얼마나[정도나 수량을 물음]","duōme"));
            data.add(new hskWord("多少","얼마[수량을 물음]","duōshǎo"));
            data.add(new hskWord("饿","배고프다","è"));
            data.add(new hskWord("而且","~뿐만 아니라","érqiě"));
            data.add(new hskWord("儿子","아들","érzi"));
            data.add(new hskWord("耳朵","귀","ěrduo"));
            data.add(new hskWord("二","둘","èr"));
            data.add(new hskWord("发烧","열이 나다","fāshāo"));
            data.add(new hskWord("发现","발견하다","fāxiàn"));
            data.add(new hskWord("饭馆","식당","fànguǎn"));
            data.add(new hskWord("方便","편리하다","fāngbiàn"));
            data.add(new hskWord("房间","방","fángjiān"));
            data.add(new hskWord("放","놓아주다, 놓다","fàng"));
            data.add(new hskWord("放心","안심하다","fàngxīn"));
            data.add(new hskWord("非常","굉장히","fēicháng"));
            data.add(new hskWord("飞机","비행기","fēijī"));
            data.add(new hskWord("分","나누다; 분(시간의 단위])); 펀(중국의 화폐 단위)","fēn"));
            data.add(new hskWord("分钟","분(시간)","fēnzhōng"));
            data.add(new hskWord("服务员","종업원","fúwùyuán"));
            data.add(new hskWord("附近","부근","fùjìn"));
            data.add(new hskWord("复习","복습하다","fùxí"));
            data.add(new hskWord("干净","깨끗하다","gānjìng"));
            data.add(new hskWord("敢","감히~하다","gǎn"));
            data.add(new hskWord("感冒","감기","gǎnmào"));
            data.add(new hskWord("刚才","방금","gāngcái"));
            data.add(new hskWord("高","(높이)놓다, (키)크다","gāo"));
            data.add(new hskWord("高兴","즐겁다","gāoxìng"));
            data.add(new hskWord("告诉","알리다","gàosù"));
            data.add(new hskWord("哥哥","나이가 많은 남자 형제(오빠, 형)","gēge"));
            data.add(new hskWord("个","개(특정한 양사를 가지지 않는 명사를 셈)","ge"));
            data.add(new hskWord("给","주다; ~에게~을 주다","gěi"));
            data.add(new hskWord("跟","~와","gēn"));
            data.add(new hskWord("根据","~에 근거하여","gēnjù"));
            data.add(new hskWord("更","더욱","gēng"));
            data.add(new hskWord("公共汽车","버스","gōnggòng qìchē"));
            data.add(new hskWord("公斤","킬로그램","gōngjīn"));
            data.add(new hskWord("公司","회사","gōngsī"));
            data.add(new hskWord("公园","공원","gōngyuán"));
            data.add(new hskWord("工作","일하다, 작업","gōngzuò"));
            data.add(new hskWord("狗","개(동물)","gǒu"));
            data.add(new hskWord("故事","이야기","gùshì"));
            data.add(new hskWord("刮风","바람이 불다","guāfēng"));
            data.add(new hskWord("关","닫다","guān"));
            data.add(new hskWord("关系","관계","guānx"));
            data.add(new hskWord("关心","관심을 가지다","guānxīn"));
            data.add(new hskWord("关于","~에 관하여","guānyú "));
            data.add(new hskWord("贵","비싸다","guì"));
            data.add(new hskWord("国家","나라","guójiā"));
            data.add(new hskWord("果汁","과일주스","guǒzhī"));
            data.add(new hskWord("过去","과거, 지나가다","guòqù"));
            data.add(new hskWord("过","동사 뒤에 쓰여 경험을 나타냄","guò"));
            data.add(new hskWord("还","여전히, 아직도, 또","hái"));
            data.add(new hskWord("还是","여전히, 그래도, ~하는 것이 낫다","háishi"));
            data.add(new hskWord("孩子","아이","háizi"));
            data.add(new hskWord("害怕","무서워하다","hàipà"));
            data.add(new hskWord("汉语","중국어","Hànyǔ"));
            data.add(new hskWord("好","좋다","hǎo"));
            data.add(new hskWord("好吃","맛있다","hǎochī"));
            data.add(new hskWord("号","일(날짜)","hào"));
            data.add(new hskWord("喝","마시다","hē"));
            data.add(new hskWord("和","~와","hé"));
            data.add(new hskWord("河","강","hé"));
            data.add(new hskWord("黑","검다","hēi"));
            data.add(new hskWord("黑板","칠판","hēibǎn"));
            data.add(new hskWord("很","매우","hěn"));
            data.add(new hskWord("红","붉다","hóng"));
            data.add(new hskWord("后面","뒤쪽","hòumiàn"));
            data.add(new hskWord("护照","여권","hùzhào"));
            data.add(new hskWord("花","꽃, (시간, 금전)소비하다, 쓰다","huā"));
            data.add(new hskWord("花园","화원","huāyuán"));
            data.add(new hskWord("画","그리다, 그림","huà"));
            data.add(new hskWord("坏","나쁘다, 고장 나다","huài"));
            data.add(new hskWord("欢迎","환영하다","huānyíng"));
            data.add(new hskWord("还","돌려주다","huán"));
            data.add(new hskWord("环境","환경","huánjìng"));
            data.add(new hskWord("换","교환하다","huàn"));
            data.add(new hskWord("黄","노랗다","huáng"));
            data.add(new hskWord("回","돌아가다, 돌아오다","huí"));
            data.add(new hskWord("回答","대답하다","huídá"));
            data.add(new hskWord("会","~할 수 있다, ~할 것이다","huì"));
            data.add(new hskWord("会议","회의","huìyì"));
            data.add(new hskWord("火车站","기차역","huǒchēzhàn"));
            data.add(new hskWord("或者","혹은","huòzhě"));
            data.add(new hskWord("机场","공항","jīchǎng"));
            data.add(new hskWord("鸡蛋","달걀","jīdàn"));
            data.add(new hskWord("几乎","거의","jīhū"));
            data.add(new hskWord("机会","기회","jīhuì"));
            data.add(new hskWord("极","극히, 대단히","jí"));
            break;

        case 3 :

            data.add(new hskWord("几","몇(의문대명사)","jǐ"));
            data.add(new hskWord("记得","기억하고 있다","jìde"));
            data.add(new hskWord("季节","계절","jìjié"));
            data.add(new hskWord("家","집, 기업, 가게 등을 세는 양사","jiā"));
            data.add(new hskWord("检查","검사하다","jiǎnchá"));
            data.add(new hskWord("简单","간단하다","jiǎndān"));
            data.add(new hskWord("件","옷, 짐 등을 세는 양사","jiàn"));
            data.add(new hskWord("健康","건강(하다)","jiànkāng"));
            data.add(new hskWord("见面","만나다","jiànmiàn"));
            data.add(new hskWord("讲","말하다, 강연하다","jiǎng"));
            data.add(new hskWord("教","가르치다","jiāo"));
            data.add(new hskWord("角","지아오(중국의 화폐단위)","jiǎo"));
            data.add(new hskWord("脚","발","jiǎo"));
            data.add(new hskWord("叫","부르다, ~에게 ~을 당하다","jiào"));
            data.add(new hskWord("教室","교실","jiàoshì"));
            data.add(new hskWord("接","연결하다, 마중하다","jiē"));
            data.add(new hskWord("街道","큰길, 거리","jiēdào"));
            data.add(new hskWord("结婚","결혼하다","jiéhūn"));
            data.add(new hskWord("结束","끝나다","jiéshù"));
            data.add(new hskWord("节目","프로그램","jiémù"));
            data.add(new hskWord("节日","기념일, 명절","jiérì"));
            data.add(new hskWord("姐姐","나이가 많은 여자형제(언니, 누나)","jiějie"));
            data.add(new hskWord("解决","해결하다","jiějué"));
            data.add(new hskWord("借","빌리다","jiè"));
            data.add(new hskWord("介绍","소개하다","jièshào"));

            data.add(new hskWord("今天","오늘","jīntiān"));
            data.add(new hskWord("进","(앞으로)나아가다, (안으로)들어가다","jìn"));
            data.add(new hskWord("近","가깝다","jìn"));
            data.add(new hskWord("经常","항상","jīngcháng"));
            data.add(new hskWord("经过","거치다, 과정","jīngguò"));
            data.add(new hskWord("经理","사장","jīnglǐ"));
            data.add(new hskWord("九","아홉","jiǔ"));
            data.add(new hskWord("久","(시간)길다, 오래다","jiǔ"));
            data.add(new hskWord("旧","과거의; 낡다","jiù"));
            data.add(new hskWord("就","바로, 곧","jiù"));
            data.add(new hskWord("举行","개최하다","jǔxíng"));
            data.add(new hskWord("句子","문장","jùz"));
            data.add(new hskWord("觉得","~라고 느끼다, 생각하다","juéde"));
            data.add(new hskWord("决定","결정하다","juédìng"));
            data.add(new hskWord("咖啡","커피","kāfēi"));
            data.add(new hskWord("开","열다, (전원)켜다","kāi"));
            data.add(new hskWord("开始","시작하다","kāishǐ"));
            data.add(new hskWord("看","보다","kàn"));
            data.add(new hskWord("看见","보다","kànjiàn"));
            data.add(new hskWord("考试","시험(치다)","kǎoshì"));
            data.add(new hskWord("渴","목마르다","kě"));
            data.add(new hskWord("可爱","귀엽다","kě’ài"));
            data.add(new hskWord("可能","아마도","kěnéng"));
            data.add(new hskWord("可以","~할 수 있다","kěyǐ"));
            data.add(new hskWord("刻","15분","kè"));

            data.add(new hskWord("课","수업","kè"));
            data.add(new hskWord("客人","손님","kèrén"));
            data.add(new hskWord("空调","에어컨","kōngtiáo"));
            data.add(new hskWord("口","식구[가족을 셀 때 쓰는 양사]","kǒu"));
            data.add(new hskWord("哭","울다","kū"));
            data.add(new hskWord("裤子","바지","kùzi"));
            data.add(new hskWord("块","위앤(중국의 화폐 단위)","kuài"));
            data.add(new hskWord("快","빠르다","kuài"));
            data.add(new hskWord("快乐","즐겁다","kuàilè"));
            data.add(new hskWord("筷子","젓가락","kuàiz"));
            data.add(new hskWord("来","오다","lái"));
            data.add(new hskWord("蓝","파란색의","lán"));
            data.add(new hskWord("老","늙다, 오래되다","lǎo"));
            data.add(new hskWord("老师","선생님","lǎoshī"));
            data.add(new hskWord("了","동사뒤에 쓰여 완료, 변화를 나타냄","le"));
            data.add(new hskWord("累","피곤하다","lèi"));
            data.add(new hskWord("冷","춥다","lěng"));
            data.add(new hskWord("离","~로부터","lí"));
            data.add(new hskWord("离开","떠나다","líkāi"));
            data.add(new hskWord("里","안","lǐ"));
            data.add(new hskWord("礼物","선물","lǐwù"));
            data.add(new hskWord("历史","역사","lìshǐ"));
            data.add(new hskWord("脸","얼굴","liǎn"));
            data.add(new hskWord("练习","연습(하다)","liànxí"));
            data.add(new hskWord("两","둘","liǎng"));

            data.add(new hskWord("辆","대(차량을 세는 양사)","liàng"));
            data.add(new hskWord("了解","이해하다","liǎojiě"));
            data.add(new hskWord("邻居","이웃","línjū"));
            data.add(new hskWord("零","숫자 0","líng"));
            data.add(new hskWord("六","육","liù"));
            data.add(new hskWord("楼","건물, 층","lóu"));
            data.add(new hskWord("路","길","lù"));
            data.add(new hskWord("旅游","여행하다","lǚyóu"));
            data.add(new hskWord("绿","녹색의","lǜ"));
            data.add(new hskWord("妈妈","어머니","māma"));
            data.add(new hskWord("马","말(동물)","mǎ"));
            data.add(new hskWord("马上","곧, 바로","mǎshàng"));
            data.add(new hskWord("吗","문장 끝에 쓰여 의문의 어기를 나타냄","má"));
            data.add(new hskWord("买","사다","mǎi"));
            data.add(new hskWord("卖","팔다","mài"));
            data.add(new hskWord("满意","만족하다","mǎnyì"));
            data.add(new hskWord("慢","느리다","màn"));
            data.add(new hskWord("忙","바쁘다","máng"));
            data.add(new hskWord("猫","고양이","māo"));
            data.add(new hskWord("帽子","모자","màozi"));
            data.add(new hskWord("没","없다; 과거의 부정","méi"));
            data.add(new hskWord("每","매, 각, ~마다","měi"));
            data.add(new hskWord("妹妹","여동생","mèimei"));
            data.add(new hskWord("门","문","mén"));


            break;
        case 4 :

            data.add(new hskWord("米" ,"쌀", "mǐ"));
            data.add(new hskWord("米饭" ,"쌀밥", "mǐfàn"));
            data.add(new hskWord("面包" ,"빵", "miànbāo"));
            data.add(new hskWord("面条" ,"국수", "miàntiáo"));
            data.add(new hskWord("明白" ,"이해하다", "míngbai"));
            data.add(new hskWord("明天" ,"내일", "míngtiān"));
            data.add(new hskWord("名字" ,"이름", "míngzì"));
            data.add(new hskWord("拿" ,"들다", "ná"));
            data.add(new hskWord("哪(儿)" ,"어느 것, 어디", "nǎ"));
            data.add(new hskWord("那(儿)" ,"저, 저것, 저곳", "nà"));
            data.add(new hskWord("奶奶" ,"할머니", "nǎina"));
            data.add(new hskWord("南" ,"남쪽", "nán"));
            data.add(new hskWord("男人" ,"남자", "nánrén"));
            data.add(new hskWord("难" ,"어렵다", "nán"));
            data.add(new hskWord("难过" ,"(마음)괴롭다", "nánguò"));
            data.add(new hskWord("呢" ,"의문문 끝에 쓰여 의문의 어기를 나타냄", "ne"));
            data.add(new hskWord("能" ,"~할 수 있다", "néng"));
            data.add(new hskWord("你" ,"당신", "nǐ"));
            data.add(new hskWord("年" ,"년, 해", "nián"));
            data.add(new hskWord("年级" ,"학년", "niánjí"));
            data.add(new hskWord("年轻" ,"젊다", "niánqīng"));
            data.add(new hskWord("鸟" ,"새(동물)", "niǎo"));
            data.add(new hskWord("您" ,"당신(2인칭의 존칭)", "nín"));
            data.add(new hskWord("牛奶" ,"우유", "niúnǎi"));
            data.add(new hskWord("努力" ,"노력하다", "nǔlì"));

            data.add(new hskWord("女儿" ,"딸", "nǚ’ér"));
            data.add(new hskWord("女人" ,"여자", "nǚrén"));
            data.add(new hskWord("爬山" ,"등산하다", "pá shān"));
            data.add(new hskWord("盘子" ,"쟁반", "pánzi"));
            data.add(new hskWord("旁边" ,"옆, 부근", "pángbiān"));
            data.add(new hskWord("胖" ,"뚱뚱하다", "pàng"));
            data.add(new hskWord("跑步" ,"달리다", "pǎobù"));
            data.add(new hskWord("朋友" ,"친구", "péngyou"));
            data.add(new hskWord("啤酒" ,"맥주", "píjiǔ"));
            data.add(new hskWord("便宜" ,"(값이)싸다", "piányi"));
            data.add(new hskWord("票" ,"표, 증명서", "piào"));
            data.add(new hskWord("漂亮" ,"예쁘다", "piàoliang"));
            data.add(new hskWord("苹果" ,"사과", "píngguǒ"));
            data.add(new hskWord("葡萄" ,"포도", "pútáo"));
            data.add(new hskWord("普通话" ,"(현대 중국어의)표준어", "pǔtōnghuà"));
            data.add(new hskWord("七" ,"일곱", "qī"));
            data.add(new hskWord("妻子" ,"아내", "qīzǐ"));
            data.add(new hskWord("其实" ,"사실은", "qíshí"));
            data.add(new hskWord("其他" ,"기타, 그 외", "qítā"));
            data.add(new hskWord("骑" ,"(말, 자전거에)타다", "qí"));
            data.add(new hskWord("奇怪" ,"이상하다", "qíguài"));
            data.add(new hskWord("起床" ,"기상하다, 일어나다", "qǐchuáng"));
            data.add(new hskWord("千" ,"천", "qiān"));
            data.add(new hskWord("铅笔" ,"열필", "qiānbǐ"));
            data.add(new hskWord("钱" ,"돈", "qián"));

//351~400
            data.add(new hskWord("前面" ,"앞쪽", "qiánmian"));
            data.add(new hskWord("清楚" ,"분명하다", "qīngchu"));
            data.add(new hskWord("晴" ,"(하늘이)맑다", "qíng"));
            data.add(new hskWord("请" ,"요구하다, 부탁하다", "qǐng"));
            data.add(new hskWord("秋" ,"가을", "qiū"));
            data.add(new hskWord("去" ,"가다", "qù"));
            data.add(new hskWord("去年" ,"작년", "qùnián"));
            data.add(new hskWord("裙子" ,"치마", "qúnzi"));
            data.add(new hskWord("然后" ,"그런 후에", "ránhòu"));
            data.add(new hskWord("让" ,"~하여금 ~하도록 하다", "rang"));
            data.add(new hskWord("热" ,"덥다", "rè"));
            data.add(new hskWord("热情" ,"열정(적이다)", "rèqíng"));
            data.add(new hskWord("人" ,"사람", "rén"));
            data.add(new hskWord("认识" ,"알다, 인식하다", "rèn‧shi"));
            data.add(new hskWord("认为" ,"생각하다, 여기다", "rènwéi"));
            data.add(new hskWord("认真" ,"성실하다", "rènzhēn"));
            data.add(new hskWord("日" ,"날, 일", "rì"));
            data.add(new hskWord("容易" ,"쉽다", "róngyì"));
            data.add(new hskWord("如果" ,"만약", "rúguǒ"));
            data.add(new hskWord("三" ,"셋", "sān"));
            data.add(new hskWord("伞" ,"우산", "sǎn"));
            data.add(new hskWord("商店" ,"상점", "shāngdiàn"));
            data.add(new hskWord("上" ,"위, (시간, 순서 등의)앞", "shàng"));
            data.add(new hskWord("上班" ,"출근하다", "shàngbān"));
            data.add(new hskWord("上网" ,"인터넷하다", "shàngwǎng"));

            data.add(new hskWord("上午" ,"오전", "shàngwǔ"));
            data.add(new hskWord("少" ,"적다", "shǎo"));
            data.add(new hskWord("谁" ,"누구", "shéi"));
            data.add(new hskWord("身体" ,"신체", "shēntǐ"));
            data.add(new hskWord("什么" ,"무엇", "shénme"));
            data.add(new hskWord("生病" ,"병이 나다", "shēngbìng"));
            data.add(new hskWord("生气" ,"화내다", "shēngqì"));
            data.add(new hskWord("生日" ,"생일", "shēngrì"));
            data.add(new hskWord("声音" ,"목소리, 음성", "shēngyīn"));
            data.add(new hskWord("十" ,"열", "shí"));
            data.add(new hskWord("时候" ,"때, 시각", "shíhou"));
            data.add(new hskWord("时间" ,"시간", "shíjiān"));
            data.add(new hskWord("使" ,"(~에게)~하게 하다", "shǐ"));
            data.add(new hskWord("是" ,"~이다, 옳다", "shì"));
            data.add(new hskWord("世界" ,"세계", "shìjiè"));
            data.add(new hskWord("事情" ,"일, 사건", "shì‧qing"));
            data.add(new hskWord("手表" ,"손목시계", "shǒubiǎo"));
            data.add(new hskWord("手机" ,"휴대전화", "shǒujī"));
            data.add(new hskWord("瘦" ,"마르다, 야위다", "shòu"));
            data.add(new hskWord("书" ,"책", "shū"));
            data.add(new hskWord("舒服" ,"편안하다", "shū‧fu"));
            data.add(new hskWord("叔叔" ,"삼촌, 아저씨", "shūshu"));
            data.add(new hskWord("树" ,"나무", "shù"));
            data.add(new hskWord("数学" ,"수학", "shùxué"));
            data.add(new hskWord("刷牙" ,"이를 닦다", "shuāyá"));

            break;
        case 5 :

            data.add(new hskWord("双", "쌍, 켤레(짝을 이룬 물건을 셀 때 쓰는 양사)", "shuāng"));
            data.add(new hskWord("水", "물", "shuǐ"));
            data.add(new hskWord("水果", "과일", "shuǐguǒ"));
            data.add(new hskWord("水平", "수준, 능력", "shuǐpíng"));
            data.add(new hskWord("睡觉", "잠을 자다", "shuìjiào"));
            data.add(new hskWord("说话", "말하다", "shuōhuà"));
            data.add(new hskWord("司机", "운전사", "sījī"));
            data.add(new hskWord("四", "넷", "sì"));
            data.add(new hskWord("送", "보내다, 선물하다, 배달하다", "sòng"));
            data.add(new hskWord("虽然", "비록 ~일지라도", "suīrán"));
            data.add(new hskWord("岁", "세[나이]", "suì"));
            data.add(new hskWord("所以", "그래서", "suǒyǐ"));
            data.add(new hskWord("他", "그", "tā"));
            data.add(new hskWord("她", "그녀", "tā"));
            data.add(new hskWord("它", "그(것), 저(것)", "tā"));
            data.add(new hskWord("太", "너무, 대단히", "tài"));
            data.add(new hskWord("太阳", "태양, 해", "tàiyáng"));
            data.add(new hskWord("糖", "설탕, 사탕", "táng"));
            data.add(new hskWord("特别", "특별하다; 특히", "tèbié"));
            data.add(new hskWord("疼", "아프다", "téng"));
            data.add(new hskWord("踢足球", "축구를 하다", "tīzúqiú"));
            data.add(new hskWord("题", "문제", "tí"));
            data.add(new hskWord("提高", "제고하다", "tígāo"));
            data.add(new hskWord("体育", "체육", "tǐyù"));
            data.add(new hskWord("天气", "날씨", "tiānqì"));

            data.add(new hskWord("甜", "달다", "tián"));
            data.add(new hskWord("条", "펜, 생선 등 가늘고 긴 것을 세는 양사", "tiáo"));
            data.add(new hskWord("跳舞", "춤을 추다", "tiàowǔ"));
            data.add(new hskWord("听", "듣다", "tīng"));
            data.add(new hskWord("同事", "동료", "tóngshì"));
            data.add(new hskWord("同学", "학우", "tóngxué"));
            data.add(new hskWord("同意", "동의하다", "tóngyì"));
            data.add(new hskWord("头发", "머리카락", "tóufa"));
            data.add(new hskWord("突然", "갑작스럽다; 갑자기", "tūrán"));
            data.add(new hskWord("图书馆", "도서관", "túshūguǎn"));
            data.add(new hskWord("腿", "다리", "tuǐ"));
            data.add(new hskWord("外", "바깥쪽", "wài"));
            data.add(new hskWord("完", "마치다", "wán"));
            data.add(new hskWord("完成", "완성하다", "wánchéng"));
            data.add(new hskWord("玩", "놀다", "wán"));
            data.add(new hskWord("碗", "그릇; 그릇을 셀 때 쓰임", "wǎn"));
            data.add(new hskWord("晚上", "저녁", "wǎnshang"));
            data.add(new hskWord("万", "만", "wàn"));
            data.add(new hskWord("忘记", "잊어버리다", "wàngjì"));
            data.add(new hskWord("喂", "여보세요[전화할 때는2성으로 발음]", "wéi, wèi"));
            data.add(new hskWord("为", "~을 위하여, ~에게", "wéi"));
            data.add(new hskWord("为了", "~하기 위하여", "wèile"));
            data.add(new hskWord("为什么", "왜, 어째서", "wèishénme"));
            data.add(new hskWord("位", "분[사람의 수를 셀 때 쓰는 양사]", "wèi"));
            data.add(new hskWord("文化", "문화", "wénhuà"));


            data.add(new hskWord("问","묻다","wèn"));
            data.add(new hskWord("问题","문제","wèntí"));
            data.add(new hskWord("我","나","wǒ"));
            data.add(new hskWord("我们","우리(들)","wǒmen"));
            data.add(new hskWord("五","다섯","wǔ"));
            data.add(new hskWord("西","서쪽","xī"));
            data.add(new hskWord("西瓜","수박","xīguā"));
            data.add(new hskWord("希望","희망(하다)","xīwàng"));
            data.add(new hskWord("习惯","습관(이 되다)","xíguàn"));
            data.add(new hskWord("洗","씻다, 세탁하다","xǐ"));
            data.add(new hskWord("洗手间","화장실","xǐshǒujiān"));
            data.add(new hskWord("洗澡","목욕하다","xǐzǎo"));
            data.add(new hskWord("喜欢","좋아하다","xǐhuan"));
            data.add(new hskWord("下","아래, (시간, 순서 등의)뒤","xià"));
            data.add(new hskWord("下午","오후","xiàwǔ"));
            data.add(new hskWord("下雨","비가 오다","xiàyǔ"));
            data.add(new hskWord("夏天","여름","xiàtiān"));
            data.add(new hskWord("先","우선","xiān"));
            data.add(new hskWord("先生","선생, 성인 남성에 대한 경칭","xiānsheng"));
            data.add(new hskWord("现在","지금","xiànzài"));
            data.add(new hskWord("香蕉","바나나","xiāngjiāo"));
            data.add(new hskWord("相同","서로 같다","xiāngtóng"));
            data.add(new hskWord("相信","믿다","xiāngxìn"));
            data.add(new hskWord("想"," ~하려고 하다, ~하길 바라다","xiǎng"));
            data.add(new hskWord("向","~을 향해","xiàng"));

            data.add(new hskWord("像","닮았다","xiàng"));
            data.add(new hskWord("小","작다","xiǎo"));
            data.add(new hskWord("小姐","아가씨","xiǎo‧jie"));
            data.add(new hskWord("小时","시간","xiǎoshí"));
            data.add(new hskWord("小心","조심하다","xiǎoxīn"));
            data.add(new hskWord("笑","웃다","xiào"));
            data.add(new hskWord("校长","교장","xiàozhǎng"));
            data.add(new hskWord("些","조금, 약간","xiē"));
            data.add(new hskWord("鞋","신발","xié"));
            data.add(new hskWord("写","쓰다, 적다","xiě"));
            data.add(new hskWord("谢谢","감사하다","xièxie"));
            data.add(new hskWord("新","새롭다","xīn"));
            data.add(new hskWord("新闻","신문, 뉴스","xīnwén"));
            data.add(new hskWord("新鲜","신선하다","xīnxiān"));
            data.add(new hskWord("信","편지","xìn"));
            data.add(new hskWord("星期","요일, 주","xīngqī"));
            data.add(new hskWord("行李箱","짐가방","xíngli xiāng"));
            data.add(new hskWord("姓","성씨","xìng"));
            data.add(new hskWord("兴趣","재미, 흥미","xìngqù"));
            data.add(new hskWord("熊猫","팬더(동물)","xióngmāo"));
            data.add(new hskWord("休息","휴식하다","xiūxi"));
            data.add(new hskWord("需要","필요(로 하다), 요구하다","xūyào"));
            data.add(new hskWord("选择","선택(하다)","xuǎnzé"));
            data.add(new hskWord("学生","학생","xuésheng"));
            data.add(new hskWord("学习","공부(하다)","xuéxí"));

            break;

        case 6 :
            data.add(new hskWord("学校","학교","xuéxiào"));
            data.add(new hskWord("雪","눈","xuě"));
            data.add(new hskWord("颜色","색깔","yánsè"));
            data.add(new hskWord("眼镜","안경","yǎnjìng"));
            data.add(new hskWord("眼睛","눈","yǎn‧jing"));
            data.add(new hskWord("羊肉","양고기","yángròu"));
            data.add(new hskWord("要求","요구(하다)","yāoqiú"));
            data.add(new hskWord("药","약","yào"));
            data.add(new hskWord("要","~하려고 하다","yào"));
            data.add(new hskWord("爷爷","할아버지","yéye"));
            data.add(new hskWord("也","~도 또한, ~도 역시","yě"));
            data.add(new hskWord("一","하나","yī"));
            data.add(new hskWord("衣服","옷","yīfu"));
            data.add(new hskWord("医生","의사","yīshēng"));
            data.add(new hskWord("医院","병원","yīyuàn"));
            data.add(new hskWord("一定","반드시","yídìng"));
            data.add(new hskWord("一共","모두","yīgòng"));
            data.add(new hskWord("一会儿","잠시","yīhuìr"));
            data.add(new hskWord("一样","같다","yīyàng"));
            data.add(new hskWord("以后","이후","yǐhòu"));
            data.add(new hskWord("以前","이전","yǐqián"));
            data.add(new hskWord("以为","여기다, 생각하다","yǐwéi"));
            data.add(new hskWord("已经","이미, 벌써","yǐjing"));
            data.add(new hskWord("椅子","의자","yǐzi"));
            data.add(new hskWord("一般","보통이다, 일반적이다","yībān"));

            data.add(new hskWord("一边","한편으로","yībiān"));
            data.add(new hskWord("一起","함께","yīqǐ"));
            data.add(new hskWord("一直","계속해서, 줄곧","yīzhí"));
            data.add(new hskWord("意思","의미, 생각","yìsi"));
            data.add(new hskWord("阴","흐리다","yīn"));
            data.add(new hskWord("因为","~로 인해","yīnwèi"));
            data.add(new hskWord("音乐","음악","yīnyuè"));
            data.add(new hskWord("银行","은행","yínháng"));
            data.add(new hskWord("应该","마땅히 ~해야 한다","yīnggāi"));
            data.add(new hskWord("影响","영향","yǐngxiǎng"));
            data.add(new hskWord("用","사용하다, 쓰다","yòng"));
            data.add(new hskWord("游戏","오락, 게임(하다)","yóuxì"));
            data.add(new hskWord("游泳","수영(하다)","yóuyǒng"));
            data.add(new hskWord("有","있다","yǒu"));
            data.add(new hskWord("有名","유명하다","yǒumíng"));
            data.add(new hskWord("又","다시, 또","yòu"));
            data.add(new hskWord("右边","오른쪽","yòubiān"));
            data.add(new hskWord("鱼","물고기","yú"));
            data.add(new hskWord("遇到","마주치다","yùdào"));
            data.add(new hskWord("元","위앤(중국의 화폐 단위)","yuán"));
            data.add(new hskWord("远","멀다","yuǎn"));
            data.add(new hskWord("愿意","원하다; ~하고 싶다","yuànyi"));
            data.add(new hskWord("月","월","yuè"));
            data.add(new hskWord("月亮","달","yuèliang"));
            data.add(new hskWord("越","점점, 더욱더","yuè"));

            data.add(new hskWord("云","구름","yún"));
            data.add(new hskWord("运动","운동(하다)","yùndòng"));
            data.add(new hskWord("在","있다; ~에","zài"));
            data.add(new hskWord("再","다시","zài"));
            data.add(new hskWord("再见","또 뵙겠습니다","zàijiàn"));
            data.add(new hskWord("早上","아침","zǎoshang"));
            data.add(new hskWord("怎么","어떻게","zěnme"));
            data.add(new hskWord("怎么样","어떠하다","zěnmeyàng"));
            data.add(new hskWord("站","서다, 일어서다","zhàn"));
            data.add(new hskWord("张","평면이 넓고 두드러진 것을 세는 양사","zhāng"));
            data.add(new hskWord("长","자라다, 생기다","zhǎng"));
            data.add(new hskWord("丈夫","남편","zhàngfū"));
            data.add(new hskWord("着急","조급해하다","zháojí"));
            data.add(new hskWord("找","찾다","zhǎo"));
            data.add(new hskWord("照顾","보살펴주다","zhàogù"));
            data.add(new hskWord("照片","사진","zhàopiàn"));
            data.add(new hskWord("照相机","사진기","zhàoxiàngjī"));
            data.add(new hskWord("这(儿)","이, 이 곳","zhè"));
            data.add(new hskWord("着"," ~한 상태로 있다","zhe"));
            data.add(new hskWord("真","정말로","zhēn"));
            data.add(new hskWord("正在","지금 ~하고 있다","zhèngzài"));
            data.add(new hskWord("知道","알다","zhīdao"));
            data.add(new hskWord("只","단지, 겨우","zhī"));
            data.add(new hskWord("中国","중국","Zhōngguó"));
            data.add(new hskWord("中间","가운데","zhōngjiān"));

            data.add(new hskWord("中午","정오","zhōngwǔ"));
            data.add(new hskWord("终于","마침내","zhōngyú"));
            data.add(new hskWord("种","종류를 셀 때 쓰는 양사","zhǒng"));
            data.add(new hskWord("重要","중요하다","zhòngyào"));
            data.add(new hskWord("周末","주말","zhōumò"));
            data.add(new hskWord("主要","주요한","zhǔyào"));
            data.add(new hskWord("住","거주하다","zhù"));
            data.add(new hskWord("祝","축원하다","zhù"));
            data.add(new hskWord("注意","주의하다","zhùyì"));
            data.add(new hskWord("准备","준비(하다)","zhǔnbèi"));
            data.add(new hskWord("桌子","탁자","zhuōzi"));
            data.add(new hskWord("字","글자","zì"));
            data.add(new hskWord("字典","자전","zìdiǎn"));
            data.add(new hskWord("自己","자기, 스스로","zìjǐ"));
            data.add(new hskWord("自行车","자전거","zìxíngchē"));
            data.add(new hskWord("总是","항상","zǒngshì"));
            data.add(new hskWord("走","걷다, 가다","zǒu"));
            data.add(new hskWord("最","제일, 가장","zuì"));
            data.add(new hskWord("最近","최근","zuìjìn"));
            data.add(new hskWord("昨天","어제","zuótiān"));
            data.add(new hskWord("左边","왼쪽","zuǒbiān"));
            data.add(new hskWord("坐","앉다, (교통수단)타다","zuò"));
            data.add(new hskWord("作","하다","zuò"));
            data.add(new hskWord("作业","숙제","zuòyè"));
            data.add(new hskWord("作用","작용(하다), 효과(를 미치다)","zuòyòng"));


            break;



    }

        return data;
    }


}
