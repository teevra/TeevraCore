/* Generated by Xgen from: E90.02.00 on: 2006-02-16 08:30 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubStratInsMkt.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Strategy Inside Market
*
*******************************************************************************/

#ifndef _SUBSTRATINSMKT_HXX_
#define _SUBSTRATINSMKT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_SUB_STRAT_INS_MKT_PUB_BCAST_T_
#define _BSC_SUB_STRAT_INS_MKT_PUB_BCAST_T_

typedef struct bscSubStratInsMktPubBcastTag
{
    stratIdGrpT      stratIdGrp;
    bstOrdrGrpT      bstOrdrGrp;
} bscSubStratInsMktPubBcastT, *pBscSubStratInsMktPubBcastT;

#endif  /* _BSC_SUB_STRAT_INS_MKT_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_SUB_STRAT_INS_MKT_PUB_BCAST_T_
#define _EXT_SUB_STRAT_INS_MKT_PUB_BCAST_T_

typedef struct extSubStratInsMktPubBcastTag
{
    char             lstTrdPrc       [DRIV_PRICE_LEN];
    char             lstTrdQty       [DRIV_QUANTITY_LEN];
    char             trdTim          [DRIV_TIME_LEN];
    char             stratReqTim     [DRIV_TIME_LEN];
    char             stratReqBidQty  [DRIV_QUANTITY_LEN];
    char             stratReqAskQty  [DRIV_QUANTITY_LEN];
    char             trnTypId;
    char             crBidQty        [DRIV_VOLUME_LEN];
    char             crAskQty        [DRIV_VOLUME_LEN];
    char             crTim           [DRIV_TIME_LEN];
    char             blkAuctStsCod;
} extSubStratInsMktPubBcastT, *pExtSubStratInsMktPubBcastT;

#endif  /* _EXT_SUB_STRAT_INS_MKT_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _SUB_STRAT_INS_MKT_PUB_BCAST_T_
#define _SUB_STRAT_INS_MKT_PUB_BCAST_T_

typedef struct subStratInsMktPubBcastTag
{
    dataHeaderT      header;
    bscSubStratInsMktPubBcastT basic;
    extSubStratInsMktPubBcastT extension;
} subStratInsMktPubBcastT, *pSubStratInsMktPubBcastT;

#endif  /* _SUB_STRAT_INS_MKT_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _BSC_SUB_STRAT_INS_MKT_SUBJECT_T_
#define _BSC_SUB_STRAT_INS_MKT_SUBJECT_T_

typedef struct bscSubStratInsMktSubjectTag
{
    char             prodId          [PROD_ID_LEN];
    char             stratTyp        [STRAT_TYP_LEN];
} bscSubStratInsMktSubjectT, *pBscSubStratInsMktSubjectT;

#endif  /* _BSC_SUB_STRAT_INS_MKT_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBSTRATINSMKT_HXX_ */

/******************************************************************************/
/* End of file SubStratInsMkt.hxx */
/******************************************************************************/