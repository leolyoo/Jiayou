package com.lws.android.jiayou;

import java.util.ArrayList;

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
                        words.add(new Word("您", "nín", "당신", 1));
                        words.add(new Word("喝", "hē", "마시다", 2));
                        words.add(new Word("什么", "shénme", "무엇", 3));
                        words.add(new Word("饮料", "yǐnliào", "음료", 4));
                        words.add(new Word("橙汁", "chéngzhī", "오렌지 주스", 5));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("有", "Yǒu", "있다", 1));
                        words.add(new Word("可乐", "kě lè", "콜라", 2));
                        words.add(new Word("雪碧", "xuě bì", "사이다", 3));
                        words.add(new Word("矿泉水", "kuàng quán shuǐ", "물", 4));
                        words.add(new Word("橙汁", "chéng zhī", "오렌지 주스", 5));
                        words.add(new Word("苹果汁", "píng guǒ zhī", "사과 주스", 6));
                        words.add(new Word("芒果汁", "mángguǒ zhī", "망고 주스", 7));
                        words.add(new Word("番茄汁", "fān qié zhī", "토마토 주스", 8));
                        words.add(new Word("啤酒", "pí jiǔ", "맥주", 9));
                        words.add(new Word("葡萄酒", "pú táo jiǔ", "와인", 10));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("喝", "hē", "마시다", 1));
                        words.add(new Word("咖啡", "kāfēi", "커피", 2));
                        words.add(new Word("还是", "háishì", "~아니면", 3));
                        words.add(new Word("绿茶", "lǜchá", "녹차", 4));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("美式咖啡", "měishì kāfēi", "아메리카노", 1));
                        words.add(new Word("要", "yào", "필요하다, 원하다", 2));
                        words.add(new Word("红茶", "hóngchá", "홍차", 3));
                        words.add(new Word("奶茶", "nǎichá", "밀크티", 4));
                        words.add(new Word("拿铁", "ná tiě", "라떼", 5));
                        words.add(new Word("杯", "bēi", "잔, 컵", 6));
                        words.add(new Word("本", "běn", "권", 7));
                        words.add(new Word("本子", "běn zi", "노트", 8));
                        words.add(new Word("件", "jiàn", "벌", 9));
                        words.add(new Word("衣服", "yīfú", "옷", 10));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("要", "yào", "원하다", 1));
                        words.add(new Word("加", "jiā", "더하다", 2));
                        words.add(new Word("糖", "táng", "설탕", 3));
                        words.add(new Word("和", "hé", "~와", 4));
                        words.add(new Word("奶", "nǎi", "크림, 우유", 5));
                        words.add(new Word("只", "zhǐ", "단지", 6));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("要", "yào", "원하다", 1));
                        words.add(new Word("加", "jiā", "더하다", 2));
                        words.add(new Word("不", "bù", "부정의 표시", 3));
                        words.add(new Word("冰块", "bīng kuài", "얼음", 4));
                        words.add(new Word("柠檬", "níngméng", "레몬", 5));
                        words.add(new Word("牛奶", "niúnǎi", "우유", 6));
                        words.add(new Word("请", "qǐng", "청하다", 7));
                        words.add(new Word("慢", "màn", "느리다", 8));
                        words.add(new Word("用", "yòng", "드시다", 9));
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("今天", "Jīn tiān", "오늘", 1));
                        words.add(new Word("有", "yǒu", "있다", 2));
                        words.add(new Word("两", "liǎng", "둘", 3));
                        words.add(new Word("种", "zhǒng", "종류", 4));
                        words.add(new Word("餐食", "cān shí", "식사", 5));
                        words.add(new Word("喜欢", "xǐ huān", "좋아하다", 6));
                        words.add(new Word("哪", "nǎ", "어느", 7));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("牛肉", "niúròu", "소고기", 1));
                        words.add(new Word("盖饭", "gài fàn", "덮밥", 2));
                        words.add(new Word("太…了", "tài…le", "너무 ~하다", 3));
                        words.add(new Word("淡", "dàn", "싱겁다", 4));
                        words.add(new Word("给", "gěi", "주다", 5));
                        words.add(new Word("盐", "yán", "소금", 6));
                        words.add(new Word("黄油", "huángyóu", "버터", 7));
                        words.add(new Word("胡椒", "hújiāo", "후추", 8));
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("牛肉盖饭", "niúròu gàifàn", "소고기 덮밥", 1));
                        words.add(new Word("没有", "méiyǒu", "없다", 2));
                        words.add(new Word("了", "le", "변화", 3));
                        words.add(new Word("鸡肉", "jīròu", "닭고기", 4));
                        words.add(new Word("怎么样", "zěnme yàng", "어떠한가", 5));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("好了", "hǎo le", "다 했다", 1));
                        words.add(new Word("把", "bǎ", "전치", 2));
                        words.add(new Word("餐盘", "cān pán", "식사 트레이", 3));
                        words.add(new Word("可以", "kěyǐ", "가능하다", 4));
                        words.add(new Word("拿走", "ná zǒu", "가져가다", 5));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("预订", "yùdìng", "예약하다", 1));
                        words.add(new Word("过", "guò", "경험", 2));
                        words.add(new Word("特殊餐", "tèshūcān", "special meal", 3));
                        words.add(new Word("婴儿餐", "yīng'ér cān", "BBML", 4));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("预订", "yùdìng", "예약하다", 1));
                        words.add(new Word("儿童餐", "értóng cān", "Child Meal", 2));
                        words.add(new Word("素食", "sù shí", "Vegetarian Meal", 3));
                        words.add(new Word("溃疡餐", "kuì yáng cān", "Bland Meal", 4));
                        words.add(new Word("穆斯林餐", "mù sī lín cān", "Muslim Meal", 5));
                        words.add(new Word("犹太餐", "yóu tài cān", "Kosher Meal", 6));
                        words.add(new Word("印度餐", "yìn dù cān", "Hindu Meal", 7));
                        words.add(new Word("还", "hái", "또, 더", 8));
                        words.add(new Word("需要", "xūyào", "필요하다", 9));
                        words.add(new Word("什么", "shénme", "무엇", 10));
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("有点儿", "yǒudiǎnr", "조금", 1));
                        words.add(new Word("冷", "lěng", "춥다", 2));
                        words.add(new Word("给", "gěi", "~에게,주다", 3));
                        words.add(new Word("毛毯", "máotǎn", "담요", 4));
                        words.add(new Word("头疼", "tóuténg", "머리가 아프다", 5));
                        words.add(new Word("止疼片", "zhǐ téng piàn", "진통제", 6));
                        words.add(new Word("拖鞋", "tuōxié", "슬리퍼", 7));
                        words.add(new Word("眼罩", "yǎnzhào", "안대", 8));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("耳机", "ěrjī", "이어폰", 1));
                        words.add(new Word("好像", "hǎoxiàng", "~인 것 같다", 2));
                        words.add(new Word("坏", "huài", "고장나다", 3));
                        words.add(new Word("马上", "mǎshàng", "곧", 4));
                        words.add(new Word("换", "huàn", "바꾸다", 5));
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("入境卡", "rù jìng kǎ", "입국신고서", 1));
                        words.add(new Word("每个人", "měi ge rén", "매 사람", 2));
                        words.add(new Word("都", "dōu", "모두", 3));
                        words.add(new Word("要", "yào", "~해야한다", 4));
                        words.add(new Word("填写", "tián xiě", "작성하다", 5));
                        words.add(new Word("张", "zhāng", "장", 6));
                        words.add(new Word("检疫申报单", "jiǎnyì shēnbào dān", "검역신고서", 7));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("海关申报单", "hǎi guān shēn bào dān", "세관신고서", 1));
                        words.add(new Word("家人", "jiā rén", "식구", 2));
                        words.add(new Word("填写", "tián xiě", "작성하다", 3));
                        words.add(new Word("张", "zhāng", "장", 4));
                        words.add(new Word("就行", "jiù xíng", "~하면 된다", 5));
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("想", "xiǎng", "~하고싶다", 1));
                        words.add(new Word("买", "mǎi", "사다", 2));
                        words.add(new Word("口红", "kǒuhóng", "립스틱", 3));
                        words.add(new Word("要", "yào", "~하려고 하다", 4));
                        words.add(new Word("哪", "nǎ", "어느", 5));
                        words.add(new Word("种", "zhǒng", "종류", 6));
                        words.add(new Word("颜色", "yánsè", "색상yánsè", 7));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("想", "xiǎng", "~하고싶다", 1));
                        words.add(new Word("介绍", "jièshào", "소개하다", 2));
                        words.add(new Word("给", "gěi", "~에게", 3));
                        words.add(new Word("瓶", "píng", "병", 4));
                        words.add(new Word("香水", "xiāng shuǐ", "향수", 5));
                        words.add(new Word("欢迎", "huān yíng", "환영", 6));
                        words.add(new Word("收到", "shòu dào", "받다", 7));
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("人民币", "Rénmínbì", "인민폐", 1));
                        words.add(new Word("多少", "duōshǎo", "얼마", 2));
                        words.add(new Word("钱", "qián", "돈", 3));
                        words.add(new Word("块", "kuài", "화폐단위 (소수점 윗자리)", 4));
                        words.add(new Word("毛", "máo", "화폐단위 (소수점 첫째자리)", 5));
                        words.add(new Word("分", "fēn", "화폐단위 (소수점 둘째자리)", 6));
                        words.add(new Word("百", "bǎi", "백", 7));
                        words.add(new Word("千", "qiān", "천", 8));
                        words.add(new Word("万", "wàn", "만", 9));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("汇率", "huìlǜ", "환율", 1));
                        words.add(new Word("多少", "duōshǎo", "얼마", 2));
                        words.add(new Word("美元", "měiyuán", "달러", 3));
                        words.add(new Word("等于", "děngyú", "해당하다", 4));
                        words.add(new Word("韩币", "hánbì", "한화", 5));
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("想", "xiǎng", "~하려하다", 1));
                        words.add(new Word("怎么", "zěnme", "어떻게", 2));
                        words.add(new Word("用", "사용하다", "사용하다", 3));
                        words.add(new Word("人民币", "rénmínbì", "인민폐", 4));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("想", "xiǎng", "~하려 하다", 1));
                        words.add(new Word("用", "yòng", "사용하다", 2));
                        words.add(new Word("信用卡", "xìn yòng kǎ", "신용카드", 3));
                        words.add(new Word("韩币", "hán bì", "원화", 4));
                        words.add(new Word("美元", "měi yuán", "달러", 5));
                        words.add(new Word("欧元", "ōu yuán", "유로화", 6));
                        words.add(new Word("日元", "rì yuán", "엔화", 7));
                        words.add(new Word("现金", "xiàn jīn", "현금", 8));
                        words.add(new Word("结算", "jiésuàn", "계산하다", 9));
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("给", "gěi", "주다", 1));
                        words.add(new Word("护照", "hù zhào", "여권", 2));
                        words.add(new Word("和", "hé", "~와", 3));
                        words.add(new Word("信用卡", "xìn yòng kǎ", "신용카드", 4));
                        words.add(new Word("在", "zài", "~에", 5));
                        words.add(new Word("这里", "zhèlǐ", "이곳", 6));
                        words.add(new Word("签名", "qiānmíng", "서명하다", 7));
                        break;
                    case Constants.PART_2:
                        words.add(new Word("零钱", "líng qián", "잔돈", 1));
                        words.add(new Word("人民币", "rén mín bì", "인민폐", 2));
                        words.add(new Word("韩币", "hán bì", "원화", 3));
                        words.add(new Word("美元", "měi yuán", "달러", 4));
                        words.add(new Word("确认", "quèrèn", "확인하다", 5));
                        words.add(new Word("一下", "yíxià", "한번 ~하다", 6));
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
                        blanks.add(new Blank("您 (__) 什么 饮料？", "Nín hē shénme yǐnliào?", "당신은 무슨 음료를 마시겠습니까?", "喝"));
                        blanks.add(new Blank("您 喝 什么 (__)？", "Nín hē shénme yǐnliào?", "당신은 무슨 음료를 마시겠습니까?", "饮料"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē chéngzhī.", "저는 오렌지주스를 마시겠습니다. ", "橙汁"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("有  橙汁，苹果汁 (__) 芒果汁。", "Yǒu chéngzhī, píngguǒzhī hé mángguǒzhī.", "오렌지주스, 사과주스와 망고주스가 있습니다.", "和"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē píngguǒzhī.", "저는 사과주스를 마시겠습니다.", "苹果汁"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē kělè.", "저는 콜라를 마시겠습니다.", "可乐"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē fān qié zhī.", "저는 토마토주스를 마시겠습니다.", "番茄汁"));
                        blanks.add(new Blank("我 喝 (__) 。", "Wǒ hē pí jiǔ.", "저는 맥주를 마시겠습니다.", "啤酒"));
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("您 (__) 咖啡 还是 喝 绿茶？", "Nín hē kāfēi háishì hē lǜchá?", "당신은 커피를 마시겠습니까? 아니면 차를 마시겠습니까?", "喝"));
                        blanks.add(new Blank("您 喝 咖啡 (__) 喝 绿茶？", "Nín hē kāfēi háishì hē lǜchá?", "당신은 커피를 마시겠습니까? 아니면 차를 마시겠습니까?", "还是"));
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē kāfēi.", "저는 커피를 마시겠습니다.", "咖啡"));
                        blanks.add(new Blank("我 喝 (__) 。", "Wǒ hē lǜchá.", "저는 녹차를 마시겠습니다.", "绿茶"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 喝 (__)。", "Wǒ hē měishì kāfēi.", "저는 아메리카노를 마시겠습니다.", "美式咖啡"));
                        blanks.add(new Blank("我 要 两 (__) 红茶.", "Wǒ yào liǎng bēi hóngchá.", "저는 홍차 2잔을 원합니다.", "杯"));
                        blanks.add(new Blank("我 (__) 两 杯 拿铁.", "Wǒ yào liǎng bēi ná tiě", "저는 라떼 2잔을 원합니다.", "要"));
                        blanks.add(new Blank("三 (__) 本子", "sān běn běn zi", "세 권의 노트", "本"));
                        blanks.add(new Blank("五 (__) 衣服", "wǔ jiàn yīfú", "다섯 벌의 옷", "件"));
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("(__) 加 糖 和 奶 吗？", "yào jiā táng hé nǎi ma?", "설탕, 크림을 넣으시겠습니까?", "要"));
                        blanks.add(new Blank("要 (__) 糖 和 奶 吗？", "yào jiā táng hé nǎi ma?", "설탕, 크림을 넣으시겠습니까?", "加"));
                        blanks.add(new Blank("我 (__) 要 加 糖。", "Wǒ zhǐ yào jiā táng.", "저는 설탕만 필요합니다.", "只"));
                        blanks.add(new Blank("我 只 要 (__)。", "Wǒ zhǐ yào jiā táng.", "저는 설탕만 필요합니다.", "加糖"));
                        blanks.add(new Blank("我 只 要 (__)。", "Wǒ zhǐ yào jiā nǎi.", "저는 설탕만 필요합니다.", "加奶"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("(__) 冰块 吗？", "yàojiā bīng kuài ma?", "얼음을 넣으시겠습니까?", "要加"));
                        blanks.add(new Blank("要 加 (__) 吗？", "Yào jiā niúnǎi ma?", "우유를 넣으시겠습니까?", "牛奶"));
                        blanks.add(new Blank("我 (__) 加 冰块。", "Wǒ bú yào jiā bīng kuài.", "저는 얼음을 넣는 것을 원하지 않습니다.", "不要"));
                        blanks.add(new Blank("我 不 要 加 (__)。", "Wǒ bú yào jiā níngméng.", "저는 레몬을 넣는 것을 원하지 않습니다.", "柠檬"));
                        blanks.add(new Blank("请 (__) 用！", "Qǐng màn yòng! 慢", "맛있게 드십시오.", "慢"));
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("今天 有 两 种 (__)。", "Jīn tiān yǒu liǎng zhǒng cān shí.", "오늘은 두 종류의 식사가 있습니다.", "餐食"));
                        blanks.add(new Blank("今天 有 (__) 餐食。", "Jīn tiān yǒu liǎngzhǒng cān shí.", "오늘은 두 종류의 식사가 있습니다.", "两种"));
                        blanks.add(new Blank("您 喜欢 吃 (__)？", "Nín xǐ huān chī nǎ zhǒng？", "어떤 종류를 드시겠습니까?", "哪种"));
                        blanks.add(new Blank("您 (__) 吃 哪种？", "Nín xǐ huān chī nǎ zhǒng？", "어떤 종류를 드시겠습니까?", "喜欢"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("我 吃 (__) 盖饭。", "Wǒ chī niúròu gàifàn.", "저는 소고기 덮밥을 먹겠습니다.", "牛肉"));
                        blanks.add(new Blank("(__) 淡 了。", "Tai dan le.", "너무 싱겁습니다.", "太"));
                        blanks.add(new Blank("太 (__) 了。", "Tai dan le.", "너무 싱겁습니다.", "淡"));
                        blanks.add(new Blank("请 (__) 我 盐.", "Qǐng gěi wǒ yán.", "소금을 주십시오.", "给"));
                        blanks.add(new Blank("请 给 我 (__).", "Qǐng gěi wǒ yán.", "소금을 주십시오.", "盐"));
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("(__) 盖饭 没有 了。", "Niúròu gàifàn méiyǒu le", "소고기 덮밥이 소진되었습니다.", "牛肉"));
                        blanks.add(new Blank("盖饭 没有 (__)。", "Niúròu gàifàn méiyǒu le", "소고기 덮밥이 소진되었습니다.", "了"));
                        blanks.add(new Blank("(__)鸡肉盖饭怎么样?", "Chī jīròu gài fàn zěnme yàng?", "닭고기 덮밥을 드시는 것은 어떠십니까?", "吃"));
                        blanks.add(new Blank("吃鸡肉盖饭(__)?", "Chī jīròu gài fàn zěnme yàng?", "닭고기 덮밥을 드시는 것은 어떠십니까?", "怎么样"));
                        break;
                    case Constants.PART_2:
                        blanks.add(new Blank("吃 (__) 吗？", "Chī hǎole ma?", "다 드셨습니까?", "好了"));
                        blanks.add(new Blank("(__) 餐盘 可以 拿走 吗?", "Bǎ cānpán kěyǐ názǒu ma?", "가져가도 되겠습니까?", "把"));
                        blanks.add(new Blank("把 餐盘 可以 (__) 吗?", "Bǎ cānpán kěyǐ názǒu ma?", "가져가도 되겠습니까?", "拿走"));
                        blanks.add(new Blank("把 (__) 可以 拿走 吗?", "Bǎ cānpán kěyǐ názǒu ma?", "가져가도 되겠습니까?", "把"));
                        blanks.add(new Blank("(__)", "", "", ""));
                        blanks.add(new Blank("(__)", "", "", ""));
                        blanks.add(new Blank("(__)", "", "", ""));
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
        }
        return blanks;
    }
}
